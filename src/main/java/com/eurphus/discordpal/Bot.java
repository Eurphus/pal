package com.eurphus.discordpal;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;
import java.io.FileNotFoundException;

public class Bot {
    private final ShardManager shardManager;
    private final Dotenv config;

    public Bot() throws LoginException, FileNotFoundException {
        config = Dotenv.configure().load();

        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(config.get("TOKEN"));
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.watching("DD Acceptances"));
        shardManager = builder.build();
    }

    public ShardManager getShardManager() { return shardManager; }

    public static void main(String[] args) {
        try {
            Bot bot = new Bot();
        } catch (LoginException e) {
            System.out.println("Wrong Token. Silly");
        } catch(Exception e) {
            System.out.println("Something went wrong, I am not sure?");
            System.out.println(e);
        }
    }
}
