package com.extron.discord.commands;

import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.User;

import java.util.ArrayList;
import java.util.List;

public interface Command {

    String getName();

    void execute(Member m, String[] args);

    default List<String> getAliases() {
        return new ArrayList<>();
    }

    String getDescription();

}
