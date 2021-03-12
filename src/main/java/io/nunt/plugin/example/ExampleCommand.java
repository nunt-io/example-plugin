package io.nunt.plugin.example;

import io.nunt.core.command.Command;
import io.nunt.core.command.CommandMessage;
import io.nunt.core.plugin.annotation.PluginCommand;

@PluginCommand("example")
public class ExampleCommand extends Command {

    @Override
    public void call(CommandMessage commandMessage) {
        commandMessage.respond("example");
    }
}
