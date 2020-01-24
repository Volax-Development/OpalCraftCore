package fr.volax.opalcraft.utils;

import fr.volax.opalcraft.OpalCraftCorePlugin;
import fr.volax.opalcraft.loaders.CmdLoader;
import fr.volax.opalcraft.loaders.EvtLoader;


import java.util.HashMap;
import java.util.UUID;

public class Utils {
    public static OpalCraftCorePlugin instance;
    public static HashMap<UUID, Long> cooldown = new HashMap<>();
    public static OpalCraftCorePlugin getInstance() { return instance; }

    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void loadMain(OpalCraftCorePlugin instance){
        Security Security = new Security();
        Utils.instance = instance;
        instance.saveDefaultConfig();
        Security.verif();

        EvtLoader.load(instance);
        CmdLoader.load(instance);
    }
}
