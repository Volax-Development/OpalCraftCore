package fr.volax.opalcraft.commands;

import fr.volax.opalcraft.utils.Config;
import fr.volax.opalcraft.utils.Messages;
import fr.volax.opalcraft.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandOpalCraft implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!Messages.noplayer(sender)) return false;
        Player player = (Player)sender;
        if(!Messages.noperm(player, Config.getString("permissions.opalcraft-command"))) return false;

        if(args.length == 0){
            player.sendMessage(Config.getString("messages.help0"));
            return false;
        }else if(args.length == 1){
            if(args[0].equalsIgnoreCase("reload") || args[0].equalsIgnoreCase("rl")){
                player.sendMessage(Config.getString("messages.config-reload"));
                Utils.getInstance().reloadConfig();
                return false;
            }else if(args[0].equalsIgnoreCase("help")){
                player.sendMessage(Config.getString("messages.help1"));
                player.sendMessage(Config.getString("messages.help2"));
                player.sendMessage(Config.getString("messages.help3"));
                player.sendMessage(Config.getString("messages.help4"));
                return false;
            }else if(args[0].equalsIgnoreCase("clearchat")){
                Messages.noperm(player, Config.getString("permissions.clearchat"));
                for(int x = 0; x < 100; x++){
                    Bukkit.broadcastMessage("");
                }
                Bukkit.broadcastMessage(Config.getString("messages.clearchat").replaceAll("%player%", player.getName()));
            }else{
                player.sendMessage(Config.getString("messages.help0"));
                return false;
            }
        }else if(args.length == 2 && args[0].equalsIgnoreCase("cooldownchat")){
            if(!Messages.noperm(player, Config.getString("permissions.cooldownchat"))) return false;
            if(Utils.isInt(args[1])){
                Config.set("cooldownchat.time", args[0]);
                player.sendMessage(Config.getString("messages.cooldownchat-set").replaceAll("%secondes%", args[1]));
            }else{
                player.sendMessage(Config.getString("messages.pas-chiffre").replaceAll("%arg1%", args[1]));
                return false;
            }
        }
        return false;
    }
}
