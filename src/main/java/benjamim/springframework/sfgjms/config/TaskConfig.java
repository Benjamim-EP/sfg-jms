package benjamim.springframework.sfgjms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Enables Spring's scheduling functionality and asynchronous processing.
 */
@EnableScheduling
@EnableAsync
@Configuration
public class TaskConfig {
    /**
     * This method defines a TaskExecutor bean for handling asynchronous tasks.
     *
     * @return A TaskExecutor bean, in this case, a SimpleAsyncTaskExecutor.
     */
    @Bean
    TaskExecutor taskExecutor(){
        return new SimpleAsyncTaskExecutor();
    }
}