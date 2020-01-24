package fr.volax.opalcraft.listeners;

import fr.volax.opalcraft.utils.Config;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeath implements Listener {
    @EventHandler
    public void deathEntity(EntityDeathEvent event){
        LivingEntity entity = event.getEntity();
        World world = entity.getWorld();
        if(entity instanceof Skeleton && world.getName().equals("greenfield") && entity.getCustomName().equals(Config.getString("mobs.skeleton-name"))){
                    event.getDrops().clear();
                    return;
        }
        if(entity instanceof Zombie && world.getName().equals("greenfield") && entity.getCustomName().equals(Config.getString("mobs.zombie-name"))){
                    event.getDrops().clear();
        }
    }
}
