package de.superioz.library.minecraft.test;

import de.superioz.library.minecraft.server.common.command.AllowedCommandSender;
import de.superioz.library.minecraft.server.common.command.Command;
import de.superioz.library.minecraft.server.common.command.CommandCase;
import de.superioz.library.minecraft.server.common.command.context.CommandContext;
import net.md_5.bungee.api.ChatColor;

/**
 * Created on 01.03.2016.
 */
@Command(label = "spawn", desc = "Spawns a mob/a human", min = 1, permission = "test.spawn",
		usage = "<-m|-h|-f|-n> <parameter>", commandTarget = AllowedCommandSender.PLAYER_AND_CONSOLE,
		flags = {"m", "h", "f", "n"}, flagDescriptions = {"Mob", "Human", "Fake", "Name"})
public class SpawnCommand implements CommandCase {

	@Override
	public void execute(CommandContext context){
		context.getSender().sendMessage(ChatColor.RED
				+ "Usage: /" + context.getCommand().getLabel() + " " + context.getCommand().getUsage());
	}

}