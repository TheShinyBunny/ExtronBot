package com.extron.discord.commands;

import net.dv8tion.jda.core.entities.Channel;
import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.TextChannel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandHandler {

    public static Map<String,Command> commandMap = new HashMap<>();

    public static void handle(Member m, TextChannel c, String[] args) {
        if (args.length == 0) return;
        String name = args[0];
        if (name.startsWith("/")) {
            name = name.substring(1);
        }
        args = Arrays.copyOfRange(args,1,args.length);
        Command cmd = getCommand(name);
        if (cmd == null) {
            sendMessage(c,m.getAsMention() + ", Unknown command '" + name + "'!");
        } else {
            cmd.execute(m,c,args);
        }
    }

    public static Command getCommand(String name) {
        return commandMap.get(name.toLowerCase());
    }

    public static void sendMessage(TextChannel c, String msg) {
        c.sendMessage(msg).queue();
    }
}
