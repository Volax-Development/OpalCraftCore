package fr.volax.opalcraft.commands;

import fr.volax.opalcraft.utils.Config;
import fr.volax.opalcraft.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandShop implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!Messages.noplayer(sender)) return false;
        Player player = (Player)sender;
        if(player.getWorld().getName().equalsIgnoreCase("greenfield")){
            player.sendMessage(Config.getString("messages.nomap"));
            return false;
        }
        return false;
    }
}
