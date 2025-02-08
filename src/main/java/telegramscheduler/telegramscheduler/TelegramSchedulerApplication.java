package telegramscheduler.telegramscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TelegramSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelegramSchedulerApplication.class, args);
    }

}
