package cn.yistars.yancietest.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class PlayerListener implements Listener {
    @EventHandler
    public void onEatFood(PlayerItemConsumeEvent event) {
        if (!event.getItem().getType().equals(Material.COOKED_CHICKEN) || !event.getPlayer().isSneaking()) return;

        Player player = event.getPlayer();

        player.giveExp(1);
    }
}
