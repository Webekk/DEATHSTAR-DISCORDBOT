package org.deathstar;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    public static void main(String[] args)  {

        JDA jda = JDABuilder.createDefault("token").enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
        jda.addEventListener(new Listeners());
    }

}
