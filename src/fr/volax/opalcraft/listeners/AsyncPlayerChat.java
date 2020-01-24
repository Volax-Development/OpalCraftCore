package fr.volax.opalcraft.listeners;

import fr.volax.opalcraft.utils.Config;
import fr.volax.opalcraft.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.UUID;

public class AsyncPlayerChat implements Listener {
    @EventHandler
    public void playerChatAsync(AsyncPlayerChatEvent event){
        Player player = event.getPlayer();
        if(player.hasPermission(Config.getString("permissions.cooldownchat-bypass"))){ return; }
        UUID uuid = player.getUniqueId();
        if(Utils.cooldown.containsKey(uuid)){
            float time = (System.currentTimeMillis() - Utils.cooldown.get(uuid)) / 1000;
            if(time < Config.getInt("cooldownchat.time")){
                event.setCancelled(true);
                player.sendMessage(Config.getString("messages.cooldownchat"));
            }else { Utils.cooldown.put(uuid, System.currentTimeMillis()); }
        } else{ Utils.cooldown.put(uuid, System.currentTimeMillis()); }
    }
}
