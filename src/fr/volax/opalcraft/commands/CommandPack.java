package fr.volax.opalcraft.commands;

import fr.volax.opalcraft.utils.Config;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandPack implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage(Config.getString("messages.pack"));
        return false;
    }
}
