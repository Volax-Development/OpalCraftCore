package fr.volax.opalcraft.loaders;

import fr.volax.opalcraft.OpalCraftCorePlugin;
import fr.volax.opalcraft.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventsLoader {
    public static void load(OpalCraftCorePlugin instance){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new NoDeathEvent(), instance);
        pm.registerEvents(new AsyncPlayerChat(), instance);
        pm.registerEvents(new EntitySpawn(), instance);
        pm.registerEvents(new PlayerQuit(), instance);
        pm.registerEvents(new EntityDeath(), instance);
        pm.registerEvents(new PlayerVehicleEnter(), instance);
        pm.registerEvents(new PlayerDrop(), instance);
        pm.registerEvents(new PlayerCraft(), instance);
        pm.registerEvents(new PlayerInteract(), instance);
        pm.registerEvents(new PlayerBreak(), instance);
    }
}
