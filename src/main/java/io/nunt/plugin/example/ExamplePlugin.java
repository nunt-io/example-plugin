package io.nunt.plugin.example;

import io.nunt.core.Nunt;
import io.nunt.core.dev.NDev;
import io.nunt.core.plugin.Plugin;
import io.nunt.core.plugin.annotation.*;
import io.nunt.core.service.Instance;

@PluginMain
@PluginName("Example")
@PluginAuthor("ExampleAuthor")
@PluginVersion("1.0.0")
public class ExamplePlugin extends Plugin {

    @PluginConfig(value = PluginConfig.ConfigStore.DATABASE, visibility = PluginConfig.ConfigVisibility.PRIVATE)
    public String example = "example";

    @Instance
    public ExampleBridge exampleBridge;

    @Override
    public void unload() {

    }

    @Override
    public void load() {
        Nunt.log(example);

        ExamplePlugin examplePlugin = getNunt().getInstance(ExamplePlugin.class);
        Nunt.log(examplePlugin.example);

        Nunt.log(exampleBridge.getByUser("00000000-0000-0000-0000-000000000000").getUsername());
    }

    @Override
    public void setup() {

    }

    public static void main(String[] args) {
        NDev.init(ExamplePlugin.class, "C:\\Users\\lino\\nunt");
    }
}
