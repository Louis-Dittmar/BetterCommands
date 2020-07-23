package de.louis.bettercommands.commands;


import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player) {
            Player player = (Player) sender;
            Player target = Bukkit.getPlayerExact(args[2]);



                switch (args[0]) {
                    case "0":
                    case "survival":
                        if (player.getGameMode() == GameMode.SURVIVAL) {
                            player.sendMessage("§6[§cGamemode§6]:Du Befindest dich Bereits im §cSurvival §6Gamemode.");
                            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                        } else {
                            player.sendMessage("§6[§cGamemode§6]: Du hast dein Gamemode auf §cSurvival §6Gewechselt.");
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                            player.setGameMode(GameMode.SURVIVAL);
                        }
                        break;
                    case "1":
                    case "creative":
                        if (player.getGameMode() == GameMode.CREATIVE) {
                            player.sendMessage("§6[§cGamemode§6]:Du Befindest dich Bereits im §cCreative §6Gamemode.");
                            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                        } else {
                            player.sendMessage("§6[§cGamemode§6]: Du hast dein Gamemode auf §cCreative §6Gewechselt.");
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                            player.setGameMode(GameMode.CREATIVE);
                        }
                        break;
                    case "2":
                    case "adventure":
                        if (player.getGameMode() == GameMode.ADVENTURE) {
                            player.sendMessage("§6[§cGamemode§6]:Du Befindest dich Bereits im §cAdventure §6Gamemode.");
                            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                        } else {
                            player.sendMessage("§6[§cGamemode§6]: Du hast dein Gamemode auf §cAdventure §6Gewechselt.");
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                            player.setGameMode(GameMode.ADVENTURE);
                        }
                        break;
                    case "3":
                    case "spectator":
                        if (player.getGameMode() == GameMode.SPECTATOR) {
                            player.sendMessage("§6[§cGamemode§6]:Du Befindest dich Bereits im §cSpectator §6Gamemode.");
                            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                        } else {
                            player.sendMessage("§6[§cGamemode§6]: Du hast dein Gamemode auf §cSpectator §6Gewechselt.");
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                            player.setGameMode(GameMode.SPECTATOR);
                        }
                        break;
                    default:
                        player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                        player.sendMessage("§6[§cGamemode§6]: Du kannst leider nicht in Diesen Gamemode wechseln!");

                        break;
                }



        }


        return true;
    }
}

