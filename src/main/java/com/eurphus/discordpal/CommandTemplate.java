package com.eurphus.discordpal;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

import java.util.ArrayList;

public interface CommandTemplate {

    String commandName = null;
    ArrayList<String> commandAlias = new ArrayList<>();
    String commandDescription = "Default";
    boolean requiresAdmin = false;
    void runCommand(Member author, TextChannel channel, Message message, String[] args);
}
