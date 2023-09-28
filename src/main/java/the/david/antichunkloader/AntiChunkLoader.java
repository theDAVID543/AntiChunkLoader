package the.david.antichunkloader;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiChunkLoader extends JavaPlugin {
    public EventListener eventListener;
    public JavaPlugin instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        eventListener = new EventListener();
        Bukkit.getPluginManager().registerEvents(eventListener, instance);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
