package com.extron.discord.events;

import com.extron.discord.commands.CommandHandler;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class SendMessageEvent extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String[] args = e.getMessage().getContentRaw().split(" ");
        if (args[0].startsWith("/")) {
            CommandHandler.handle(e.getMember(),e.getChannel(),args);
        }
    }
}
