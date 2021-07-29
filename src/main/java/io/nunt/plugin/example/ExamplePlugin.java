package io.nunt.plugin.example;

import io.nunt.core.Nunt;
import io.nunt.core.dev.NDev;
import io.nunt.core.plugin.Plugin;
import io.nunt.core.plugin.annotation.*;

@PluginMain
@PluginName("Example")
@PluginAuthor("ExampleAuthor")
@PluginVersion("1.0.0")
public class ExamplePlugin extends Plugin {

    @PluginConfig(value = PluginConfig.ConfigStore.DATABASE, visibility = PluginConfig.ConfigVisibility.PRIVATE)
    public static String example = "example";

    @Override
    public void load() {
        Nunt.log(example);
    }

    @Override
    public void unload() {

    }

    public static void main(String[] args) {
        NDev.init(ExamplePlugin.class);
    }

    @Override
    public void setup() {

    }
}
