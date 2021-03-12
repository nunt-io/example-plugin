package io.nunt.plugin.example;

import io.nunt.core.Nunt;
import io.nunt.core.plugin.PluginHolder;
import io.nunt.core.plugin.annotation.PluginListener;
import io.nunt.core.plugin.event.EventHandler;
import io.nunt.core.plugin.event.Listener;

@PluginListener
public class ExampleListener extends PluginHolder implements Listener {

    @EventHandler
    public void onEvent(ExampleEvent event) {
        Nunt.log(event.getExample());
    }
}
