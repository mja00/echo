package dev.mja00.echo;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EchoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Check if the sender is a player
        if (sender instanceof Player) {
            // Just send the player a message containing the arguments
            sender.sendMessage(String.join(" ", args));
        } else {
            // This means the sender is the console
            // Send the console a message containing the arguments
            Bukkit.getLogger().info(String.join(" ", args));
        }
        return true;
    }
}
