package fr.volax.opalcraft.utils;

public class Config {
    public static String getString(String value){
        return Utils.getInstance().getConfig().getString(value).replaceAll("&","§");
    }
    public static int getInt(String value){
        return Utils.getInstance().getConfig().getInt(value);
    }

    public static void set(String value, String data){
        Utils.getInstance().getConfig().set(value, data);
        Utils.getInstance().saveConfig();
        Utils.getInstance().reloadConfig();
    }
}
