package me.melarn.untitled;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new HideNickName(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
