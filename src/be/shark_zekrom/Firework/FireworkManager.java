package be.shark_zekrom.Firework;

import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkManager implements Listener {


    public static void FireworkWithFlickerWithTrail(Location loc, String type, String color1, String color2, String color3, String color4, String fade1, String fade2, String fade3, String fade4){
        Firework fw = (Firework)loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwmeta = fw.getFireworkMeta();

        FireworkEffect.Type fwType = FireworkEffect.Type.valueOf(type);
        Color Color1 = getColor(color1);
        Color Color2 = getColor(color2);
        Color Color3 = getColor(color3);
        Color Color4 = getColor(color4);
        Color Fade1 = getColor(fade1);
        Color Fade2 = getColor(fade2);
        Color Fade3 = getColor(fade3);
        Color Fade4 = getColor(fade4);

        FireworkEffect.Builder builder = FireworkEffect.builder();
        builder.withTrail()
                .withFlicker()
                .withColor(Color1)
                .withColor(Color2)
                .withColor(Color3)
                .withColor(Color4)
                .withFade(Fade1)
                .withFade(Fade2)
                .withFade(Fade3)
                .withFade(Fade4)
                .with(fwType);
        fwmeta.addEffects(builder.build());
        fw.setFireworkMeta(fwmeta);
        Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
            @Override
            public void run() {
                fw.detonate();
            }
        }, 1L);
    }
    public static void FireworkWithFlickerWithoutTrail(Location loc, String type, String color1, String color2, String color3, String color4, String fade1, String fade2, String fade3, String fade4){
        Firework fw = (Firework)loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwmeta = fw.getFireworkMeta();

        FireworkEffect.Type fwType = FireworkEffect.Type.valueOf(type);
        Color Color1 = getColor(color1);
        Color Color2 = getColor(color2);
        Color Color3 = getColor(color3);
        Color Color4 = getColor(color4);
        Color Fade1 = getColor(fade1);
        Color Fade2 = getColor(fade2);
        Color Fade3 = getColor(fade3);
        Color Fade4 = getColor(fade4);

        FireworkEffect.Builder builder = FireworkEffect.builder();
        builder.withFlicker()
                .withColor(Color1)
                .withColor(Color2)
                .withColor(Color3)
                .withColor(Color4)
                .withFade(Fade1)
                .withFade(Fade2)
                .withFade(Fade3)
                .withFade(Fade4)
                .with(fwType);
        fwmeta.addEffects(builder.build());
        fw.setFireworkMeta(fwmeta);
        Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
            @Override
            public void run() {
                fw.detonate();
            }
        }, 1L);
    }


    public static void FireworkWithoutFlickerWithTrail(Location loc, String type, String color1, String color2, String color3, String color4, String fade1, String fade2, String fade3, String fade4){
        Firework fw = (Firework)loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwmeta = fw.getFireworkMeta();

        FireworkEffect.Type fwType = FireworkEffect.Type.valueOf(type);
        Color Color1 = getColor(color1);
        Color Color2 = getColor(color2);
        Color Color3 = getColor(color3);
        Color Color4 = getColor(color4);
        Color Fade1 = getColor(fade1);
        Color Fade2 = getColor(fade2);
        Color Fade3 = getColor(fade3);
        Color Fade4 = getColor(fade4);

        FireworkEffect.Builder builder = FireworkEffect.builder();
        builder.withTrail()
                .withColor(Color1)
                .withColor(Color2)
                .withColor(Color3)
                .withColor(Color4)
                .withFade(Fade1)
                .withFade(Fade2)
                .withFade(Fade3)
                .withFade(Fade4)
                .with(fwType);
        fwmeta.addEffects(builder.build());
        fw.setFireworkMeta(fwmeta);
        Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
            @Override
            public void run() {
                fw.detonate();
            }
        }, 1L);
    }

    public static void FireworkWithoutFlickerWithoutTrail(Location loc, String type, String color1, String color2, String color3, String color4, String fade1, String fade2, String fade3, String fade4){
        Firework fw = (Firework)loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwmeta = fw.getFireworkMeta();

        FireworkEffect.Type fwType = FireworkEffect.Type.valueOf(type);
        Color Color1 = getColor(color1);
        Color Color2 = getColor(color2);
        Color Color3 = getColor(color3);
        Color Color4 = getColor(color4);
        Color Fade1 = getColor(fade1);
        Color Fade2 = getColor(fade2);
        Color Fade3 = getColor(fade3);
        Color Fade4 = getColor(fade4);

        FireworkEffect.Builder builder = FireworkEffect.builder();
        builder.withColor(Color1)
                .withColor(Color2)
                .withColor(Color3)
                .withColor(Color4)
                .withFade(Fade1)
                .withFade(Fade2)
                .withFade(Fade3)
                .withFade(Fade4)
                .with(fwType);
        fwmeta.addEffects(builder.build());
        fw.setFireworkMeta(fwmeta);
        Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
            @Override
            public void run() {
                fw.detonate();
            }
        }, 1L);
    }






    public static Color getColor(String paramString) {
        String color = paramString;
        if (color.equalsIgnoreCase("AQUA")) return Color.AQUA;
        if (color.equalsIgnoreCase("BLACK")) return Color.BLACK;
        if (color.equalsIgnoreCase("BLUE")) return Color.BLUE;
        if (color.equalsIgnoreCase("FUCHSIA")) return Color.FUCHSIA;
        if (color.equalsIgnoreCase("GRAY")) return Color.GRAY;
        if (color.equalsIgnoreCase("GREEN")) return Color.GREEN;
        if (color.equalsIgnoreCase("LIME")) return Color.LIME;
        if (color.equalsIgnoreCase("MAROON")) return Color.MAROON;
        if (color.equalsIgnoreCase("NAVY")) return Color.NAVY;
        if (color.equalsIgnoreCase("OLIVE")) return Color.OLIVE;
        if (color.equalsIgnoreCase("ORANGE")) return Color.ORANGE;
        if (color.equalsIgnoreCase("PURPLE")) return Color.PURPLE;
        if (color.equalsIgnoreCase("RED")) return Color.RED;
        if (color.equalsIgnoreCase("SILVER")) return Color.SILVER;
        if (color.equalsIgnoreCase("TEAL")) return Color.TEAL;
        if (color.equalsIgnoreCase("WHITE")) return Color.WHITE;
        if (color.equalsIgnoreCase("YELLOW")) return Color.YELLOW;
        return null;
    }



}
