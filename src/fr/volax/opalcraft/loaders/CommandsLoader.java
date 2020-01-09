package fr.volax.opalcraft.loaders;

import fr.volax.opalcraft.OpalCraftCorePlugin;
import fr.volax.opalcraft.commands.*;

public class CommandsLoader {
    public static void load(OpalCraftCorePlugin plugin){
        plugin.getCommand("3D").setExecutor(new CommandTexturePack());
        plugin.getCommand("2D").setExecutor(new CommandTexturePack());
        plugin.getCommand("opalcraft").setExecutor(new CommandOpalCraft());
        plugin.getCommand("regles").setExecutor(new CommandRegles());
        plugin.getCommand("topkills").setExecutor(new CommandTopKills());
        plugin.getCommand("pv").setExecutor(new CommandPv());
        plugin.getCommand("shop").setExecutor(new CommandShop());
        plugin.getCommand("color").setExecutor(new CommandColor());
        plugin.getCommand("pack").setExecutor(new CommandPack());
        plugin.getCommand("fakejoin").setExecutor(new CommandFake());
        plugin.getCommand("fakeleave").setExecutor(new CommandFake());
        plugin.getCommand("largage").setExecutor(new CommandLargage());
    }
}
