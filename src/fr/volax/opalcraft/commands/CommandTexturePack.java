package fr.volax.opalcraft.commands;

import fr.volax.opalcraft.utils.Config;
import fr.volax.opalcraft.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTexturePack implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!Messages.noplayer(sender)) return false;
        Player player = (Player)sender;
        if(cmd.getName().equalsIgnoreCase("3D")){
            player.sendMessage(Config.getString("messages.3D"));
        }
        if(cmd.getName().equalsIgnoreCase("2D")){
            player.sendMessage(Config.getString("messages.2D"));
        }
        return false;
    }
}
