package me.melarn.untitled;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class HideNickName implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractAtEntityEvent event) {
        // Getting the target
        Player player = event.getPlayer();

        // Проверка, что игрок зажимает клавишу Shift
        if (player.isSneaking()) {
            String playerName = event.getRightClicked().getName(); // Получение ника игрока
            player.sendActionBar(ChatColor.UNDERLINE + playerName); // Отправка сообщения в ActionBar
        }
    }
}
