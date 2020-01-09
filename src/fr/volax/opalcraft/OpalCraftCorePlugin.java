package fr.volax.opalcraft;

import fr.volax.opalcraft.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public class OpalCraftCorePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Utils.loadMain(this);
    }
}