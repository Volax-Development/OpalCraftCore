package fr.volax.opalcraft.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerDrop implements Listener {
    @EventHandler
    public void dropPlayer(PlayerDropItemEvent event){
        Player player = event.getPlayer();
        Item drop = event.getItemDrop();
        if(drop.getItemStack().getType() == Material.TNT || drop.getItemStack().getType() == Material.DIAMOND_HOE || drop.getItemStack().getType() == Material.TRIPWIRE_HOOK || drop.getItemStack().getType() == Material.LEASH || drop.getItemStack().getType() == Material.DIAMOND_SWORD || drop.getItemStack().getType() == Material.FEATHER || drop.getItemStack().getType() == Material.FLINT_AND_STEEL || drop.getItemStack().getType() == Material.SHEARS || drop.getItemStack().getType() == Material.SUGAR_CANE || drop.getItemStack().getType() == Material.ARROW || drop.getItemStack().getType() == Material.IRON_BARDING || drop.getItemStack().getType() == Material.INK_SACK || drop.getItemStack().getType() == Material.GOLD_BARDING || drop.getItemStack().getType() == Material.DIAMOND_PICKAXE || drop.getItemStack().getType() == Material.DIAMOND_AXE || drop.getItemStack().getType() == Material.DIAMOND_SPADE || drop.getItemStack().getType() == Material.NAME_TAG){
            event.setCancelled(true);
        }
    }
}
