package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KanjoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("Usage: /kanjo <energy|counter|skill|type>");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "energy":
                player.sendMessage("Kanjo Energy: Generated from emotions, with Negative (damage, attack power, critical/offensive output) and Positive (defense, durability, health, restoration) forms.");
                break;
            case "counter":
                player.sendMessage("Countering: Opposite Kanjo energies can counter each other, but it's not automatic. Counters occur when attacks directly interact, forms/types are compatible, and outputs are comparable.");
                break;
            case "skill":
                player.sendMessage("Three Kanjo Skills: I. Understand Kanjo: Learn to feel and understand Kanjo, recognizing concentration in body parts like head, arms, legs, chest/heart. II. Control Kanjo: Actively regulate and redirect Kanjo, e.g., concentrate into fist, reinforce chest, move into legs. III. Release Kanjo: Control becomes natural, Kanjo flows automatically like breathing, representing a highly developed user.");
                break;
            case "type":
                player.sendMessage("Four Kanjo Types: Every fighter can use all four types, but each develops a specialty. Types: Melee (close-range combat), Range (mid-to-long-range combat), Burst (high-damage, short-range), and Support (healing, buffing, debuffing).");
                break;
            default:
                player.sendMessage("Invalid argument. Usage: /kanjo <energy|counter|skill|type>");
                break;
        }

        return true;
    }
}