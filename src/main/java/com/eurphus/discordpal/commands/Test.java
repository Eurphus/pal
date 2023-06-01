package com.eurphus.discordpal.commands;

import com.eurphus.discordpal.CommandTemplate;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

import java.util.ArrayList;

public class Test implements CommandTemplate {
    String commandName = "test";
    String commandDescription = "A test command for the pal discord bot";
    boolean requiresAdmin = true;

    @Override
    public void runCommand(Member author, TextChannel channel, Message message, String[] args) {

    }
}
