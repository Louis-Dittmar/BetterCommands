package de.louis.bettercommands.commands;

import de.louis.bettercommands.main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.sql.Time;

public class DayCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if (sender instanceof Player) {

            if (player.hasPermission("minecraft.command.time ") || player.hasPermission(main.PluginName
                    + ".time")) {

                for (World world : Bukkit.getWorlds()) {
                    world.setTime(1000);
                }
                player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                player.sendMessage("§6[§cTime§6]: Du hast Erfolgreich die Zeit auf §cTag §6Gestellt.");
                Bukkit.getServer().broadcastMessage("§6[§cTime§6]: Der Spieler§c " + player.getDisplayName() +
                        "§6 hat die Zeit auf §cTag §6Gesetzt");


            } else {
                player.sendMessage("§c Du hast Leider nicht die Nötigen Rechte um diesen Command zu Nutzen.");
            }
        } else {

            for (World world : Bukkit.getWorlds()) {
                world.setTime(1000);
            }
            Bukkit.getServer().broadcastMessage("§6[§cTime§6]: Der Spieler§c Console §6 hat die Zeit" +
                    " auf §cTag §6Gesetzt.");

        }

        return true;
    }
}
