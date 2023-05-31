package com.eurphus.discordpal;

import io.github.cdimascio.dotenv.Dotenv;

public class config {
    public static String getToken() {
        return Dotenv.configure().load().get("TOKEN");
    }
}
