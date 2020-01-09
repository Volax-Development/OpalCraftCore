package fr.volax.opalcraft.commands;

import fr.volax.opalcraft.utils.Config;
import fr.volax.opalcraft.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandLargage implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!Messages.noplayer(sender)) return false;
        Player player = (Player)sender;
        if(!Messages.noperm(player, Config.getString("permissions.largage-use"))) return false;
        if(args.length == 0){
            player.sendMessage(Config.getString("messages.help-largage0"));
            player.sendMessage(Config.getString("messages.help-largage1"));
            player.sendMessage(Config.getString("messages.help-largage2"));
            player.sendMessage(Config.getString("messages.help-largage0"));
        }else if(args.length == 1){
            if(args[0].equalsIgnoreCase("loc")){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "envoy drops");
            }else if(args[0].equalsIgnoreCase("temp")){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "envoy time");
            }
        }

        return false;
    }
}
