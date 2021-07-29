package io.nunt.plugin.example;

import io.nunt.core.plugin.PluginHolder;
import io.nunt.core.web.HttpMethod;
import io.nunt.core.web.WebEndpoint;
import io.nunt.core.web.WebHandler;
import io.nunt.core.web.WrappedContext;

@WebEndpoint(value = "/example", method = HttpMethod.GET)
public class ExampleEndpoint extends PluginHolder implements WebHandler {

    @Override
    public void handle(WrappedContext wrappedContext) {
        ExampleEvent exampleEvent = new ExampleEvent("example");
        getNunt().getPluginManager().getEventRegistry().callEvent(exampleEvent);

        wrappedContext.success("example");
    }
}
