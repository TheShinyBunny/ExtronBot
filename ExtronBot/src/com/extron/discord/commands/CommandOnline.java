package com.extron.discord.commands;

import net.dv8tion.jda.core.entities.Member;

public class CommandOnline implements Command {


    @Override
    public String getName() {
        return "online";
    }

    @Override
    public void execute(Member m, String[] args) {

    }

    @Override
    public String getDescription() {
        return "Prints all online members";
    }
}
