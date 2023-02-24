# PackRequest

Requires players to accept and load a resourcepack to play on your server
Kicks players if download failed or declined



##Default config.yml
```yaml

#PackRequest v1.0
#Requires players to load your texture pack before playing.

#The Resource pack link, remember you need a direct-download
Link: "https://cdn.discordapp.com/attachments/1044784131877380146/1078509971261624370/Hafen_2.18.zip"

#Message that asks the player to download the pack
Request: "§b(§3!§b) §3To play on this server you need to download our custom resource pack, please §bACCEPT §3the download!"

#Kick message for when the player declines the download
Declined: "§b§lSERVER \n\n §3You have to §bACCEPT §3the pack download!"

#Kick message for when the pack download fails
Failed: "§b§lSERVER \n\n §3The pack download has §cFAILED!\n§3Please §bTRY AGAIN"

#Message when the player successfully loads the pack
Loaded: "§b(§3!§b) §3Thank you for downloading, have fun!"

```
