package fr.volax.opalcraft.listeners;

import fr.volax.opalcraft.utils.Config;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        if(!event.getPlayer().hasPlayedBefore()) {
            event.getPlayer().sendMessage(Config.getString("messages.first-join"));
        }
    }
}
