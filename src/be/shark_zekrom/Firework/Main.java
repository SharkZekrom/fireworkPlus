package be.shark_zekrom.Firework;

import be.shark_zekrom.Firework.Commands.Firework;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static JavaPlugin getPlugin() {
        return plugin;
    }
    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    private static JavaPlugin plugin;


    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getLogger().info("Plugin enabled !");
        PluginManager pm = getServer().getPluginManager();


        this.getCommand("firework+").setExecutor(new Firework());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Plugin disable !");

    }
}
