package fr.volax.opalcraft.commands;

import fr.volax.opalcraft.utils.Config;
import fr.volax.opalcraft.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFake implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!Messages.noplayer(sender)) return false;
        Player player = (Player)sender;
        if(cmd.getName().equalsIgnoreCase("fakeleave")){
            if(!Messages.noperm(player, Config.getString("permissions.fakeleave"))) return false;
            Bukkit.broadcastMessage(Config.getString("messages.fakeleave"));
        }else if(cmd.getName().equalsIgnoreCase("fakejoin")){
            if(!Messages.noperm(player, Config.getString("permissions.fakejoin"))) return false;
            Bukkit.broadcastMessage(Config.getString("messages.fakejoin"));
        }
        return false;
    }
}
