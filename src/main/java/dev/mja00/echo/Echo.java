package dev.mja00.echo;

import org.bukkit.plugin.java.JavaPlugin;

public final class Echo extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Echo has been enabled!");
        this.getCommand("echo").setExecutor(new EchoCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Echo has been disabled!");
    }
}
