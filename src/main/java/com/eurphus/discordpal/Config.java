package com.eurphus.discordpal;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    static Dotenv econfig = Dotenv.configure().load();

    public static String getToken() {
        return econfig.get("TOKEN");
    }

    public static String getAdminRole() {
        return econfig.get("ADMIN");
    }
}
