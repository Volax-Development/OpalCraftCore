package fr.volax.opalcraft.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class PlayerCraft implements Listener {
    @EventHandler
    public void CraftPlayer(CraftItemEvent event){
        event.setCancelled(true);
    }
}
