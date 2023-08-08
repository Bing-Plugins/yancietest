package cn.yistars.yancietest;

import cn.yistars.yancietest.command.MainCommand;
import cn.yistars.yancietest.command.TestCommand;
import cn.yistars.yancietest.config.ConfigAccessor;
import cn.yistars.yancietest.config.ConfigManager;
import cn.yistars.yancietest.listener.PlayerListener;
import org.bukkit.plugin.java.JavaPlugin;

public class yancietest extends JavaPlugin {
    public static yancietest instance;
    public final ConfigAccessor Lang = new ConfigAccessor(this, "Lang.yml");
    @Override
    public void onEnable() {
        instance = this;

        ConfigManager.loadConfig();

        this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);

        this.getCommand("yancietest").setExecutor(new MainCommand());
        this.getCommand("test").setExecutor(new TestCommand());

        this.getLogger().info("Enabled successfully.");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Disabled successfully.");
    }
}
