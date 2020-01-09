package fr.volax.opalcraft.commands;

import fr.volax.opalcraft.utils.Config;
import fr.volax.opalcraft.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandColor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Messages.noplayer(sender);
        Player player = (Player)sender;
        player.sendMessage(Config.getString("messages.color"));
        return false;
    }
}
