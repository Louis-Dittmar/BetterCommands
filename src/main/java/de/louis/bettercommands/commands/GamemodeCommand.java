package de.louis.bettercommands.commands;

import de.louis.bettercommands.main;
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

        Player player = (Player) sender;
        Player target = Bukkit.getPlayerExact(args[2]);
        if (args[2] == null) {

            if (sender instanceof Player) {

                if (player.hasPermission("minecraft.command.gamemode") ||
                        player.hasPermission(main.PluginName + ".command.gamemode.self")) {

                    if (args[1] == String.valueOf(0)) {
                        if (!(player.getGameMode() == GameMode.SURVIVAL)) {
                            player.setGameMode(GameMode.SURVIVAL);
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                            player.sendMessage("Du hast dein Gamemode auf Survial Gesetzt.");
                            Bukkit.getLogger().info("Der Spieler " + player.getDisplayName() +
                                    " hat sein Gamemode auf Survial Gesetzt");
                        } else {
                            player.sendMessage("Du befindest dich Bereits in deisem Gamemode.");
                            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                        }

                    }
                    if (args[1] == String.valueOf(1)) {

                        if (!(player.getGameMode() == GameMode.CREATIVE)) {
                            player.setGameMode(GameMode.CREATIVE);
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                            player.sendMessage("Du Hast dein Gamemode auf Creative Gesetzt.");
                            Bukkit.getLogger().info("Der Spieler" + player.getDisplayName() +
                                    " hat sein Gamemode auf Creative Gesetzt.");

                        } else {

                            player.sendMessage("Du befindest dich Bereits in deisem Gamemode");
                            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);

                        }


                    }
                    if (args[1] == String.valueOf(2)) {

                        if (!(player.getGameMode() == GameMode.ADVENTURE)) {
                            player.setGameMode(GameMode.ADVENTURE);
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                            player.sendMessage("Du hast dein Gamemode auf ADVenture Gesetzt.");
                            Bukkit.getLogger().info("Der Spieler " + player.getDisplayName() +
                                    "hat sein Gamemode auf Adventure gesetzt.");

                        } else {
                            {

                                player.sendMessage("Du befindest dich Bereits in deisem Gamemode");
                                player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);

                            }


                        }
                    }
                    if (args[1] == String.valueOf(3)) {

                        if (!(player.getGameMode() == GameMode.SPECTATOR)) {
                            player.setGameMode(GameMode.SPECTATOR);
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                            player.sendMessage("Du hast dein Gamemode auf Spectator Gesetzt");


                        } else {

                            player.sendMessage("Du befindest dich Bereits in deisem Gamemode");
                            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);

                        }

                    }


                } else {

                    player.sendMessage("§6[BetterCommands]§8 Du bist leider nicht berechtigt diesen befehl zu Nutzen.");
                    player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
                    Bukkit.getLogger().info("Der Spieler " + player.getDisplayName()
                            + " hat gerade versucht sein Gamemode zu ändern.");
                }

            } else {
                player.sendMessage("Du Kannst dein Gamemode nicht ändern");
            }

        } else {

            if (player.hasPermission("minecraft.command.gamemode") ||
                    player.hasPermission(main.PluginName + ".command.gamemode.other")) {


                if (args[1] == String.valueOf(0)) {

                    if (!(target.getGameMode() == GameMode.SURVIVAL)) {
                        target.setGameMode(GameMode.SURVIVAL);
                        target.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);
                        target.sendMessage("Dein Gamemmode würde von " + player.getName() + " auf Survial Gesetzt.");
                        player.sendMessage("Du hast den Gamemode von " + target.getDisplayName() + " auf Survial Gesetzt.");
                        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1);

                    } else {
                        player.sendMessage("Der Spieler " + target.getName() + "ist bereits im Survial Mode");

                    }


                }
                if (args[1] == String.valueOf(1)) {


                }
                if (args[1] == String.valueOf(2)) {


                }
                if (args[1] == String.valueOf(3)) {


                }


            }


        }


        return false;
    }

}

