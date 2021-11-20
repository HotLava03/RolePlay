package io.github.hotlava03.roleplay;

import org.bukkit.plugin.java.JavaPlugin;

public class RolePlayPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Starting RolePlay v" + getDescription().getVersion() + "...");
    }

    public void reload() {
        saveDefaultConfig();
        reloadConfig();
        // TODO: Save and/or load players.yml.
    }
}
