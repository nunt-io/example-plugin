package io.nunt.plugin.example;

import io.nunt.core.Nunt;
import io.nunt.core.plugin.Plugin;
import io.nunt.core.plugin.annotation.*;

@PluginMain
@PluginName("Example")
@PluginAuthor("lino")
@PluginVersion("1.0.0")
public class ExamplePlugin extends Plugin {

    @PluginConfig(value = PluginConfig.ConfigStore.DATABASE, visibility = PluginConfig.ConfigVisibility.PRIVATE)
    private static final String example = "example";

    @Override
    public void load() {
        Nunt.log(example);
    }

    @Override
    public void unload() {

    }

    @Override
    public void setup() {

    }
}
