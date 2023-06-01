package com.eurphus.discordpal;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Bot {

    public Bot() throws LoginException {

        //private JDA bot = new JDABuilder().build();;
        JDA bot = JDABuilder.createDefault(Config.getToken())
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.watching("DD Acceptances"))
                .build();

    }

    public static void main(String[] args) throws LoginException {
        try {
            new Bot();
        } catch (LoginException e) {
            System.out.println("Wrong Token. Silly");
        } catch(Exception e) {
            System.out.println("Something went wrong, I am not sure?");
            System.out.println(e);
        }
    }
}
