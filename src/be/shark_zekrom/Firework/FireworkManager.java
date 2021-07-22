package be.shark_zekrom.Firework;

import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkManager implements Listener {


    public static void FireworkWithFlickerWithTrail(Location loc, String type, String[] colors, String[] fades){
        Firework fw = (Firework)loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwmeta = fw.getFireworkMeta();

        FireworkEffect.Type fwType = FireworkEffect.Type.valueOf(type);

        FireworkEffect.Builder builder = FireworkEffect.builder();
        builder.withTrail()
                .withFlicker()
                .with(fwType);

        for(int i = 0; i < colors.length; ++i){
            String colorstring = colors[i];
            Color color = getColor(colorstring);
            builder.withColor(color);
        }

        for(int i = 0; i < fades.length; ++i){
            String fadestring = fades[i];
            Color fade = getColor(fadestring);
            builder.withFade(fade);
        }

        fwmeta.addEffects(builder.build());
        fw.setFireworkMeta(fwmeta);
        Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
            @Override
            public void run() {
                fw.detonate();
            }
        }, 1L);
    }
    public static void FireworkWithFlickerWithoutTrail(Location loc, String type, String[] colors, String[] fades){
        Firework fw = (Firework)loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwmeta = fw.getFireworkMeta();

        FireworkEffect.Type fwType = FireworkEffect.Type.valueOf(type);

        FireworkEffect.Builder builder = FireworkEffect.builder();
        builder.withFlicker()
                .with(fwType);

        for(int i = 0; i < colors.length; ++i){
            String colorstring = colors[i];
            Color color = getColor(colorstring);
            builder.withColor(color);
        }

        for(int i = 0; i < fades.length; ++i){
            String fadestring = fades[i];
            Color fade = getColor(fadestring);
            builder.withFade(fade);
        }

        fwmeta.addEffects(builder.build());
        fw.setFireworkMeta(fwmeta);
        Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
            @Override
            public void run() {
                fw.detonate();
            }
        }, 1L);
    }


    public static void FireworkWithoutFlickerWithTrail(Location loc, String type, String[] colors, String[] fades){
        Firework fw = (Firework)loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwmeta = fw.getFireworkMeta();

        FireworkEffect.Type fwType = FireworkEffect.Type.valueOf(type);

        FireworkEffect.Builder builder = FireworkEffect.builder();
        builder.withTrail()
                .with(fwType);

        for(int i = 0; i < colors.length; ++i){
            String colorstring = colors[i];
            Color color = getColor(colorstring);
            builder.withColor(color);
        }

        for(int i = 0; i < fades.length; ++i){
            String fadestring = fades[i];
            Color fade = getColor(fadestring);
            builder.withFade(fade);
        }

        fwmeta.addEffects(builder.build());
        fw.setFireworkMeta(fwmeta);
        Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
            @Override
            public void run() {
                fw.detonate();
            }
        }, 1L);
    }

    public static void FireworkWithoutFlickerWithoutTrail(Location loc, String type, String[] colors, String[] fades){
        Firework fw = (Firework)loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
        FireworkMeta fwmeta = fw.getFireworkMeta();

        FireworkEffect.Type fwType = FireworkEffect.Type.valueOf(type);

        FireworkEffect.Builder builder = FireworkEffect.builder();
        builder.with(fwType);

        for(int i = 0; i < colors.length; ++i){
            String colorstring = colors[i];
            Color color = getColor(colorstring);
            builder.withColor(color);
        }

        for(int i = 0; i < fades.length; ++i){
            String fadestring = fades[i];
            Color fade = getColor(fadestring);
            builder.withFade(fade);
        }

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
