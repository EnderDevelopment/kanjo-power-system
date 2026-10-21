package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

import com.enderdevelopment.plugin.commands.DisplayEnergyCommand;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("displayenergy").setExecutor(new DisplayEnergyCommand());
    }

    @Override
    public void onEnable() {
        getLogger().info("KanjoPowerSystem plugin enabled!");
        this.getCommand("kanjo").setExecutor(new KanjoCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("KanjoPowerSystem plugin disabled!");
    }
}