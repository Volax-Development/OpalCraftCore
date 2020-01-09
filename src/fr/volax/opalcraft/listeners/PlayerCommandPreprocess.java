package fr.volax.opalcraft.listeners;

import fr.volax.opalcraft.utils.Config;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PlayerCommandPreprocess implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onCommandPreProcess(PlayerCommandPreprocessEvent event) {
        String[] cmd = event.getMessage().split(" ");
        Player player = event.getPlayer();
        if(cmd[0].equalsIgnoreCase("/plugins") || cmd[0].equalsIgnoreCase("/pl") || cmd[0].equalsIgnoreCase("/bukkit:plugins") || cmd[0].equalsIgnoreCase("/bukkit:pl") || cmd[0].equalsIgnoreCase("/version") || cmd[0].equalsIgnoreCase("/ver") || cmd[0].equalsIgnoreCase("/about") || cmd[0].equalsIgnoreCase("//calc") || cmd[0].equalsIgnoreCase("/ipwl") || cmd[0].equalsIgnoreCase("/bukkit:help") || cmd[0].equalsIgnoreCase("/bukkit:?") || cmd[0].equalsIgnoreCase("/?") || cmd[0].equalsIgnoreCase("/bukkit:about") || cmd[0].equalsIgnoreCase("/bukkit:version") || cmd[0].equalsIgnoreCase("/bukkit:ver") || cmd[0].equalsIgnoreCase("/me") || cmd[0].equalsIgnoreCase("/minecraft:me") || cmd[0].equalsIgnoreCase("/minecraft:tell")){
            player.sendMessage(Config.getString("messages.GTA-dk"));
            event.setCancelled(true);
        }else if(cmd[0].equalsIgnoreCase("/tell") || cmd[0].equalsIgnoreCase("/t") || cmd[0].equalsIgnoreCase("/et") || cmd[0].equalsIgnoreCase("/etell") || cmd[0].equalsIgnoreCase("/er") || cmd[0].equalsIgnoreCase("/emsg") || cmd[0].equalsIgnoreCase("/em") || cmd[0].equalsIgnoreCase("/emessage") || cmd[0].equalsIgnoreCase("/w")){
            player.sendMessage(Config.getString("messages.do-msg"));
            event.setCancelled(true);
        }
    }
}
