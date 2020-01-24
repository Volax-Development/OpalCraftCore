package fr.volax.opalcraft.listeners;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleEnterEvent;

public class PlayerVehicleEnter implements Listener {
    @EventHandler
    public void ballFiring(VehicleEnterEvent e){
        Player p = (Player) e.getEntered();
        if (!(p.getWorld().getName().equals("spawn"))) return;
        if (e.getVehicle().getType() != EntityType.MINECART) return;
        e.setCancelled(true);
        p.sendMessage("§b§lT");
    }
}
