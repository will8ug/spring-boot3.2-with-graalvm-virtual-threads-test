package net.will.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {
    private static final Logger logger = LoggerFactory.getLogger(SchedulerService.class);

    @Scheduled(fixedDelayString = "15000")
    public void run() {
        logger.info("Scheduled method has been run: {}", Thread.currentThread());
    }
}
