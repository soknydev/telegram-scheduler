package telegramscheduler.telegramscheduler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class TelegramServiceTimeAlertImpl extends TelegramService{

    // Good Morning - 6:30 AM
    @Scheduled(cron = "0 30 6 * * ?")
    public void sendGoodMorningMessage() {
        String message = "Good Morning ☀️";
        sendMessage(message);
        log.info("Sent: {}", message);
    }

    // Good Afternoon - 12:00 PM
    @Scheduled(cron = "0 0 12 * * ?")
    public void sendGoodAfternoonMessage() {
        String message = "Good Afternoon ☀️";
        sendMessage(message);
        log.info("Sent: {}", message);
    }

    // Good Evening - 6:30 PM
    @Scheduled(cron = "0 30 18 * * ?")
    public void sendGoodEveningMessage() {
        String message = "Good Evening 🌆";
        sendMessage(message);
        log.info("Sent: {}", message);
    }

    // Good Night - 12:00 PM
    @Scheduled(cron = "0 0 0 * * ?")
    public void sendGoodNightMessage() {
        String message = "Good Night 🌙 ";
        sendMessage(message);
        log.info("Sent: {}", message);
    }

}
