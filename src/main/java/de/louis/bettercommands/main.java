package de.louis.bettercommands;

import de.louis.bettercommands.commands.DayCommand;
import de.louis.bettercommands.commands.GamemodeCommand;
import de.louis.bettercommands.commands.PingCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    public static String PluginName = "BetterCommands";

    @Override
    public void onEnable() {
        getLogger().info("Hello");
        this.getCommand("gm").setExecutor(new GamemodeCommand());
        this.getCommand("ping").setExecutor(new PingCommand());
        this.getCommand("day").setExecutor(new DayCommand());


    }

    @Override
    public void onDisable() {
        getLogger().info("Hello");


    }
}
