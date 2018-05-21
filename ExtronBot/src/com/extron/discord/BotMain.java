package com.extron.discord;

import com.extron.discord.events.Hello;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

public class BotMain {

    private static JDA jda;

    public static void main(String[] args) throws LoginException, InterruptedException {
        jda = new JDABuilder(AccountType.BOT)
                .setToken("NDQ4MDUyNjUzNjY3Mzg1MzQ0.DeQhcw.Yogazhcdm2Zvkpcu9seHo7Snw-w")
                .buildBlocking();
        jda.addEventListener(new Hello());
    }

}
