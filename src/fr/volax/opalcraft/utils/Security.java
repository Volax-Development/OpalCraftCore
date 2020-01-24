package fr.volax.opalcraft.utils;

import org.bukkit.Bukkit;

public class Security {
    public Security verif(){
        if (!Utils.getInstance().getDescription().getAuthors().contains("Volax")) {
            System.out.println("Le nom de l'auteur a été changé, le plugin se désactive !");
            Bukkit.getPluginManager().disablePlugin(Utils.getInstance());
        }
        return null;
    }
}
