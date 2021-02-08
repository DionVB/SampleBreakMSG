package me.breakmsg.net;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvents(); // register Events classes in this method.
        System.out.println("your console Online message here "); // console Online message (this send you a message in the console when the bot is online like: System.out.println("[SampleBreakMSG] Online!"].
                                                                 // then the message is [SampleBreakMSG] Online!
    }

    @Override
    public void onDisable() {
        System.out.println("your console Offline message here "); // console Offline message (this send you a message in the console when the bot is Offline like: System.out.println("[SampleBreakMSG] Offline!"].
                                                                  // then the message is [SampleBreakMSG] Offline!
    }

    // The registerEvents(); method.
    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new BlockBreakMSG(), this); // Make a new class for the BlockBreaking.
    }

}
