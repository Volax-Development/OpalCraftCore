package fr.volax.opalcraft.listeners;

import fr.volax.opalcraft.utils.Config;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class PlayerBreak implements Listener {
    @EventHandler
    public void BreakPlayer(BlockBreakEvent event){
        Block item = event.getBlock();
        Player player = event.getPlayer();
        if(!player.hasPermission(Config.getString("permissions.chestinteract"))){
            if(item.getType() == Material.CHEST){
                event.setCancelled(true);
            }
        }
    }
}
