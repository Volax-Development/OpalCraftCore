package fr.volax.opalcraft.listeners;

import fr.volax.opalcraft.OpalCraftCorePlugin;
import fr.volax.opalcraft.utils.Utils;
import net.minecraft.server.v1_8_R3.PacketPlayInClientCommand;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class NoDeathEvent implements Listener {
    @EventHandler
    public void noDeathEvent(PlayerDeathEvent event){
        Bukkit. getScheduler (). runTaskLater (Utils.getInstance(), new Runnable () {
            @Override
            public void run() {
                PacketPlayInClientCommand paquet = new PacketPlayInClientCommand (PacketPlayInClientCommand.EnumClientCommand.PERFORM_RESPAWN);
                ((CraftPlayer) event.getEntity()).getHandle().playerConnection.a(paquet);
            }
        }, 5L);
    }
}
