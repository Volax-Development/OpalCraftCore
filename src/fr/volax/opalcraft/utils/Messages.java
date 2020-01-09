package fr.volax.opalcraft.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Messages {
    public static boolean noplayer(CommandSender sender){
        if(!(sender instanceof Player)){
            sender.sendMessage(Config.getString("messages.no-player"));
            return false;
        }
        return true;
    }

    public static boolean noperm(Player player, String permission){
        if(!player.hasPermission(permission)){
            player.sendMessage(Config.getString("messages.no-perm").replaceAll("&","§"));
            return false;
        }
        return true;
    }
}
