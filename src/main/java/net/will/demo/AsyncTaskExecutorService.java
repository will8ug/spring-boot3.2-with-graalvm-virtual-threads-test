package net.will.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTaskExecutorService {
    private static final Logger logger = LoggerFactory.getLogger(AsyncTaskExecutorService.class);

    @Async
    public void run() {
        logger.info("Async task method has been run: {}", Thread.currentThread());
    }
}
