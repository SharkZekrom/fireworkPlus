package be.shark_zekrom.firework.commands;

import be.shark_zekrom.firework.FireworkManager;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Firework implements CommandExecutor, TabExecutor {



    public Iterator<Color> iterator() {
        return new Iterator<Color>() {
            public boolean hasNext() {
                return false;
            }
            public Color next() {
                throw new NoSuchElementException();
            }
        };
    }





    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String string, String[] args) {

        if (commandSender instanceof ConsoleCommandSender || commandSender instanceof BlockCommandSender) {
            if (args.length == 9 || args.length == 10) {
                //firework+ world -89 72 -24 BALL_LARGE true true YELLOW,RED,WHITE,BLUE YELLOW,RED,WHITE,BLUE 1

                Location loc = new Location(Bukkit.getWorld(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));

                String[] colors = args[7].split(",");

                String[] fades = args[8].split(",");

                String type = args[4];
                int power = 0;
                if (args.length == 10) {
                    power = Integer.parseInt(args[9]);
                }
                if (args[5].equalsIgnoreCase("true")) {
                    if (args[6].equalsIgnoreCase("true")) {
                        FireworkManager.FireworkWithFlickerWithTrail(loc, type, colors, fades, power);
                    }
                    if (args[6].equalsIgnoreCase("false")) {
                        FireworkManager.FireworkWithFlickerWithoutTrail(loc, type, colors, fades, power);
                    }

                }
                if (args[5].equalsIgnoreCase("false")) {
                    if (args[6].equalsIgnoreCase("true")) {
                        FireworkManager.FireworkWithoutFlickerWithTrail(loc, type, colors, fades, power);
                    }
                    if (args[6].equalsIgnoreCase("false")) {
                        FireworkManager.FireworkWithoutFlickerWithoutTrail(loc, type, colors, fades, power);
                    }
                }

            }
        }
        else {

            Player player = (Player) commandSender;
            if (commandSender.hasPermission("firework+.admin")) {

                if (args[0].equals("PLAYERLOCATION")) {
                    //firework+ PLAYERLOCATION <player> BALL_LARGE true true YELLOW,RED,WHITE,BLUE YELLOW,RED,WHITE,BLUE 1

                    Player playerlocation = Bukkit.getPlayer(args[1]);

                    String[] colors = args[5].split(",");

                    String[] fades = args[6].split(",");

                    String type = args[2];
                    int power = Integer.parseInt(args[7]);

                    if (args[3].equalsIgnoreCase("true")) {
                        if (args[4].equalsIgnoreCase("true")) {
                            FireworkManager.FireworkWithFlickerWithTrail(playerlocation.getLocation().add(0,1,0), type, colors, fades, power);
                        }
                        if (args[4].equalsIgnoreCase("false")) {
                            FireworkManager.FireworkWithFlickerWithoutTrail(playerlocation.getLocation().add(0,1,0), type, colors, fades, power);
                        }

                    }
                    if (args[3].equalsIgnoreCase("false")) {
                        if (args[4].equalsIgnoreCase("true")) {
                            FireworkManager.FireworkWithoutFlickerWithTrail(playerlocation.getLocation().add(0,1,0), type, colors, fades, power);
                        }
                        if (args[4].equalsIgnoreCase("false")) {
                            FireworkManager.FireworkWithoutFlickerWithoutTrail(playerlocation.getLocation().add(0,1,0), type, colors, fades, power);
                        }
                    }

                } else {


                    if (args.length == 9 || args.length == 10) {

                        Location loc = new Location(Bukkit.getWorld(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));


                        String[] colors = args[7].split(",");

                        String[] fades = args[8].split(",");

                        String type = args[4];
                        int power = 0;
                        if (args.length == 10) {
                            power = Integer.parseInt(args[9]);
                        }

                        if (args[5].equalsIgnoreCase("true")) {
                            if (args[6].equalsIgnoreCase("true")) {
                                FireworkManager.FireworkWithFlickerWithTrail(loc, type, colors, fades, power);
                            }
                            if (args[6].equalsIgnoreCase("false")) {
                                FireworkManager.FireworkWithFlickerWithoutTrail(loc, type, colors, fades, power);
                            }

                        }
                        if (args[5].equalsIgnoreCase("false")) {
                            if (args[6].equalsIgnoreCase("true")) {
                                FireworkManager.FireworkWithoutFlickerWithTrail(loc, type, colors, fades, power);
                            }
                            if (args[6].equalsIgnoreCase("false")) {
                                FireworkManager.FireworkWithoutFlickerWithoutTrail(loc, type, colors, fades, power);
                            }
                        }


                    } else {
                        player.sendMessage("§b==========[Firework+]==========");
                        player.sendMessage(ChatColor.AQUA + "");
                        player.sendMessage(ChatColor.AQUA + "/firework+ world locx locy locz type true/false color1,... fade1,...");

                    }
                }
            } else {
                player.sendMessage("§b==========[Firework+]==========");
                player.sendMessage(ChatColor.AQUA + "");
                player.sendMessage(ChatColor.AQUA + "/firework+ world locx locy locz type true/false color1,... fade1,...");

            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            List<String> arguments = new ArrayList<>();
            arguments.add("<World>");
            return arguments;
        }
        if (args.length == 2) {
            List<String> arguments = new ArrayList<>();
            arguments.add("<Locx>");
            return arguments;
        }
        if (args.length == 3) {
            List<String> arguments = new ArrayList<>();
            arguments.add("<Locy>");
            return arguments;
        }
        if (args.length == 4) {
            List<String> arguments = new ArrayList<>();
            arguments.add("<Locz>");
            return arguments;
        }
        if (args.length == 5) {
            List<String> arguments = new ArrayList<>();
            arguments.add("<Type>");
            return arguments;
        }
        if (args.length == 6) {
            List<String> arguments = new ArrayList<>();
            arguments.add("<Flicker: true/false>");
            return arguments;
        }
        if (args.length == 7) {
            List<String> arguments = new ArrayList<>();
            arguments.add("<Trail: true/false>");
            return arguments;
        }
        if (args.length == 8) {
            List<String> arguments = new ArrayList<>();
            arguments.add("<FADE1,...>");
            return arguments;
        }
        if (args.length == 9) {
            List<String> arguments = new ArrayList<>();
            arguments.add("<FADE1,...>");
            return arguments;
        }
        return null;

    }
}