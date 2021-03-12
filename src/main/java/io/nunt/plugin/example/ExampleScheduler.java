package io.nunt.plugin.example;

import io.nunt.core.Nunt;
import io.nunt.core.plugin.annotation.PluginScheduler;
import io.nunt.core.scheduler.Scheduler;
import io.nunt.core.scheduler.SchedulerDelay;
import io.nunt.core.scheduler.SchedulerRate;
import io.nunt.core.scheduler.SchedulerUnit;

import java.util.concurrent.TimeUnit;

@PluginScheduler
@SchedulerDelay(10)
@SchedulerRate(60)
@SchedulerUnit(TimeUnit.SECONDS)
public class ExampleScheduler extends Scheduler {

    @Override
    public void run() {
        Nunt.log("schedule example");
    }
}
