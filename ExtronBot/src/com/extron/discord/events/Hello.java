package com.extron.discord.events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Hello extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String[] args = e.getMessage().getContentRaw().split(" ");
        if ("Hello".equalsIgnoreCase(args[0])) {
            if (e.getMember().getUser().isBot()) return;
            e.getChannel().sendMessage("Hello " + e.getAuthor().getName() + "!").queue();
        }
    }
}
