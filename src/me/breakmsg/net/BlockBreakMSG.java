package me.breakmsg.net;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakMSG implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent e){ // the event BlockBreakEvent

        Player p = e.getPlayer(); // get the player
        Block block = e.getBlock(); // get the block

        if(block.breakNaturally()){
            p.sendMessage(ChatColor.AQUA + "You broke a block! " + ChatColor.BLUE + p.getDisplayName()); // the block broken message.

        }
    }
}


