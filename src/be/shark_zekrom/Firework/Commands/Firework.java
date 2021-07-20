package be.shark_zekrom.Firework.Commands;

import be.shark_zekrom.Firework.FireworkManager;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class Firework implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String string, String[] args) {

        if (commandSender instanceof ConsoleCommandSender || commandSender instanceof BlockCommandSender) {
            if (args.length == 9) {
                //firework+ world -89 72 -24 BALL_LARGE true YELLOW,RED,WHITE,BLUE YELLOW,RED,WHITE,BLUE

                Location loc = new Location(Bukkit.getWorld(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));


                String color1 = (args[7]).split(",")[0];
                String color2 = (args[7]).split(",")[1];
                String color3 = (args[7]).split(",")[2];
                String color4 = (args[7]).split(",")[3];

                String fade1 = (args[8]).split(",")[0];
                String fade2 = (args[8]).split(",")[1];
                String fade3 = (args[8]).split(",")[2];
                String fade4 = (args[8]).split(",")[3];

                String type = args[4];

                if (args[5].equalsIgnoreCase("true")) {
                    if (args[6].equalsIgnoreCase("true")) {
                        FireworkManager.FireworkWithFlickerWithTrail(loc, type, color1, color2, color3, color4, fade1, fade2, fade3, fade4);
                    }
                    if (args[6].equalsIgnoreCase("false")) {
                        FireworkManager.FireworkWithFlickerWithoutTrail(loc, type, color1, color2, color3, color4, fade1, fade2, fade3, fade4);
                    }

                }
                if (args[5].equalsIgnoreCase("false")) {
                    if (args[6].equalsIgnoreCase("true")) {
                        FireworkManager.FireworkWithoutFlickerWithTrail(loc, type, color1, color2, color3, color4, fade1, fade2, fade3, fade4);
                    }
                    if (args[6].equalsIgnoreCase("false")) {
                        FireworkManager.FireworkWithoutFlickerWithoutTrail(loc, type, color1, color2, color3, color4, fade1, fade2, fade3, fade4);
                    }
                }

            }
        }
        else {

            Player player = (Player) commandSender;
            if (commandSender.hasPermission("firework+.admin")) {

                if (args.length == 9) {
                    //firework+ world -89 72 -24 BALL_LARGE true true YELLOW,RED,WHITE,BLUE YELLOW,RED,WHITE,BLUE

                    Location loc = new Location(Bukkit.getWorld(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));


                    String color1 = (args[7]).split(",")[0];
                    String color2 = (args[7]).split(",")[1];
                    String color3 = (args[7]).split(",")[2];
                    String color4 = (args[7]).split(",")[3];

                    String fade1 = (args[8]).split(",")[0];
                    String fade2 = (args[8]).split(",")[1];
                    String fade3 = (args[8]).split(",")[2];
                    String fade4 = (args[8]).split(",")[3];

                    String type = args[4];

                    if (args[5].equalsIgnoreCase("true")) {
                        if (args[6].equalsIgnoreCase("true")) {
                            FireworkManager.FireworkWithFlickerWithTrail(loc, type, color1, color2, color3, color4, fade1, fade2, fade3, fade4);
                        }
                        if (args[6].equalsIgnoreCase("false")) {
                            FireworkManager.FireworkWithFlickerWithoutTrail(loc, type, color1, color2, color3, color4, fade1, fade2, fade3, fade4);
                        }

                    }
                    if (args[5].equalsIgnoreCase("false")) {
                        if (args[6].equalsIgnoreCase("true")) {
                            FireworkManager.FireworkWithoutFlickerWithTrail(loc, type, color1, color2, color3, color4, fade1, fade2, fade3, fade4);
                        }
                        if (args[6].equalsIgnoreCase("false")) {
                            FireworkManager.FireworkWithoutFlickerWithoutTrail(loc, type, color1, color2, color3, color4, fade1, fade2, fade3, fade4);
                        }
                    }



                } else {
                    player.sendMessage("§b==========[Firework+]==========");
                    player.sendMessage(ChatColor.AQUA + "");
                    player.sendMessage(ChatColor.AQUA + "/firework+ world locx locy locz type true/false color1,color2,color3,color4 fade1,fade2,fade3,fade4");

                }
            } else {
                player.sendMessage("§b==========[Firework+]==========");
                player.sendMessage(ChatColor.AQUA + "");
                player.sendMessage(ChatColor.AQUA + "/firework+ world locx locy locz type true/false color1,color2,color3,color4 fade1,fade2,fade3,fade4");

            }
        }
        return true;
    }
}
