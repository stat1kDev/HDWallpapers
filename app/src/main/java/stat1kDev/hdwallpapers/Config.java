package stat1kDev.hdwallpapers;

import stat1kDev.hdwallpapers.drawer.SimpleMenu;

public class Config {

    public static String CONFIG_URL = "";

    public static final boolean HIDE_DRAWER = false;

    public static boolean USE_HARDCODED_CONFIG = false;

    public static final int INTERSTITIAL_INTERVAL = 5;

    public static void configureMenu(SimpleMenu menu, ConfigParser.CallBack callBack) {
        callBack.configLoaded(false);
    }
}
