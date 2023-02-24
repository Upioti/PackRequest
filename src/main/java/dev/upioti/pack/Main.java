package dev.upioti.pack;




import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;
import org.bukkit.plugin.java.JavaPlugin;



public final class Main extends JavaPlugin implements Listener {

    public static Main instance;


    @Override
    public void onEnable() {

        instance = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(this, this);


    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        e.getPlayer().setResourcePack((String) getConfig().get("Link"));
        e.getPlayer().sendMessage((String) getConfig().get("Request"));


    }

    @EventHandler
    public void onResourceStatus(PlayerResourcePackStatusEvent e) {

        if (e.getStatus().equals(PlayerResourcePackStatusEvent.Status.DECLINED)) {

            e.getPlayer().kickPlayer((String) getConfig().get("Declined"));

        } else if (e.getStatus().equals(PlayerResourcePackStatusEvent.Status.FAILED_DOWNLOAD)) {

            e.getPlayer().kickPlayer((String) getConfig().get("Failed"));

        } else if (e.getStatus().equals(PlayerResourcePackStatusEvent.Status.SUCCESSFULLY_LOADED)){

            e.getPlayer().sendMessage((String) getConfig().get("Loaded"));

        }

    }
}
