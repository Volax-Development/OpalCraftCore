package fr.volax.opalcraft.listeners;

import fr.volax.opalcraft.utils.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {
    @EventHandler
    public void playerQuit(PlayerQuitEvent event){
        Utils.cooldown.remove(event.getPlayer().getUniqueId());
    }
}
