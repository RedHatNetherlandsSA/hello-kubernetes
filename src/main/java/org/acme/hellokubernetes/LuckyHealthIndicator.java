package org.acme.hellokubernetes;

import java.time.LocalTime;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component("lucky")
public class LuckyHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        final LocalTime currentTime = LocalTime.now();
        final Health.Builder healthBuilder = currentTime.getMinute() % 2 == 0 ?
                                Health.up()
                                :
                                Health.down().withDetail("time", currentTime);

        return healthBuilder.build();
    }

}