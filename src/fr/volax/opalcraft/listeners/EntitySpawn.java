package fr.volax.opalcraft.listeners;

import fr.volax.opalcraft.utils.Config;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

public class EntitySpawn implements Listener {
    @EventHandler
    public void Spawnentity(EntitySpawnEvent event){
        Entity entity = event.getEntity();
        World world = entity.getWorld();
        if(entity instanceof Skeleton) {
            if (world.getName().equals("greenfield")) {
                entity.setCustomName(Config.getString("mobs.skeleton-name"));
                ((Skeleton) entity).getEquipment().clear();
                ((Skeleton) entity).getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE, 1));
                ((Skeleton) entity).getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS, 1));
                ((Skeleton) entity).getEquipment().setBoots(new ItemStack(Material.IRON_BOOTS, 1));
                return;
            }
        }
        if(entity instanceof Zombie) {
            if (world.getName().equals("greenfield")) {
                entity.setCustomName(Config.getString("mobs.zombie-name"));
                ((Zombie) entity).getEquipment().clear();
                ((Zombie) entity).getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1));
                ((Zombie) entity).getEquipment().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS, 1));
                ((Zombie) entity).getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS, 1));
            }
        }
    }
}
