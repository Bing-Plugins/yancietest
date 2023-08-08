package cn.yistars.yancietest.command;

import cn.yistars.yancietest.yancietest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command commands, String label, String[] args) {
        sender.sendMessage("Hello world!");

        if (sender instanceof Player) {
            Player playerExp = (Player) sender;
            playerExp.giveExp(1);
            playerExp.playSound(playerExp.getLocation(), yancietest.instance.getConfig().getString("sound_fucking.caoni"),1,1);
        }
        return true;
    }

}
