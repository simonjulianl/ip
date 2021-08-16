package Implementation;

import Interface.CommandParser;
import Interface.CommandProcessor;
import Model.Command;

import java.util.Arrays;
import java.util.List;

/**
 * An entity that takes in the input from the console and parse it to valid command or throw exception
 * if the command is invalid
 */
public class CommandParserImpl implements CommandParser {
	private CommandProcessor commandProcessor;
	
	public CommandParserImpl(CommandProcessor commandProcessor) {
		this.commandProcessor = commandProcessor;
	}
	
	@Override
	public void processInput(String input) {
		List<String> parsedCommands = Arrays.asList(input.split(" "));
		switch (parsedCommands.get(0)) {
			case "bye":
				// ignore the rest of the arguments here
				commandProcessor.processCommand(Command.BYE, Arrays.asList());
			default:
				// invalid
				commandProcessor.processCommand(Command.INVALID, Arrays.asList(input));
		}
	}
}
