package com.extron.discord.commands;

import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.TextChannel;

public class CommandOnline implements Command {

    @Override
    public String getName() {
        return "online";
    }

    @Override
    public void execute(Member m, TextChannel channel, String[] args) {

    }


    @Override
    public String getDescription() {
        return "Prints all online members";
    }
}
