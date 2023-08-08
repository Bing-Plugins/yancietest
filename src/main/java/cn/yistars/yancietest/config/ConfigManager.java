package cn.yistars.yancietest.config;

import cn.yistars.yancietest.yancietest;

public class ConfigManager {
    public static void loadConfig() {
        yancietest.instance.saveDefaultConfig();
        yancietest.instance.reloadConfig();
        yancietest.instance.Lang.saveDefaultConfig();
        yancietest.instance.Lang.reloadConfig();
    }
}
