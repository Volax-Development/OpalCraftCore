package fr.volax.opalcraft.listeners;

import fr.volax.opalcraft.utils.Config;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteract implements Listener {
    @EventHandler
    public void interactPlayer(PlayerInteractEvent event){
        Action action = event.getAction();
        ItemStack item = event.getItem();
        if(action == Action.RIGHT_CLICK_BLOCK || action == Action.RIGHT_CLICK_AIR) {
            if(item.getType() == Material.COMMAND || item.getType() == Material.WORKBENCH || item.getType() == Material.FURNACE || item.getType() == Material.ANVIL || item.getType() == Material.DISPENSER || item.getType() == Material.DROPPER || item.getType() == Material.HOPPER || item.getType() == Material.BEACON || item.getType() == Material.DAYLIGHT_DETECTOR || item.getType() == Material.DAYLIGHT_DETECTOR_INVERTED || item.getType() == Material.BEACON || item.getType() == Material.BREWING_STAND || item.getType() == Material.BED){
                Config.getString("messages.impossible-interact-block");
                event.setCancelled(true);
            }else if(item.getType() == Material.MONSTER_EGG || item.getType() == Material.MONSTER_EGGS){
                Config.getString("messages.impossible-interact-item");
                event.setCancelled(true);
            }else if(item.getType() == Material.STONE_BUTTON || item.getType() == Material.WOOD_BUTTON){
                Config.getString("messages.impossible-interact-button");
                event.setCancelled(true);
            }
        }
    }
}
