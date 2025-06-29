package telegramscheduler.telegramscheduler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class TelegramServiceTimeAlertImpl extends TelegramService{

    // Good Morning - 6:00 AM
    @Scheduled(cron = "0 0 23 * * ?")
    public void sendGoodMorningMessage() {
        String message = "Good Morning ☀️";
        sendMessage(message);
        log.info("Sent: {}", message);
    } 

    // Good Afternoon - 12:00 PM
    @Scheduled(cron = "0 0 5 * * ?")
    public void sendGoodAfternoonMessage() {
        String message = "Good Afternoon ☀️";
        sendMessage(message);
        log.info("Sent: {}", message);
    }

    // Good Evening - 7:00 PM
    @Scheduled(cron = "0 0 12 * * ?")
    public void sendGoodEveningMessage() {
        String message = "Good Evening 🌆";
        sendMessage(message);
        log.info("Sent: {}", message);
    }

    // Good Night - 12:00 PM
    @Scheduled(cron = "0 0 17 * * ?")
    public void sendGoodNightMessage() {
        String message = "Good Night 🌙 ";
        sendMessage(message);
        log.info("Sent: {}", message);
    }

}
