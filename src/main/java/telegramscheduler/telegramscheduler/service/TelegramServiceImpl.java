package telegramscheduler.telegramscheduler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TelegramServiceImpl extends TelegramService {

    // Scheduled messages for specific times
    @Scheduled(cron = "0 55 1 * * ?") // Every day at 1:15 AM
    public void sendMessage() {
        sendMessage("សួស្ដី ម៉ោងជិត2លូវហើយ កាលបានដេក");
        log.info("Message: សួស្ដី");
    }

    @Scheduled(cron = "0 30 6 * * ?") // Every day at 6:30 AM
    public void sendGoodMorningMessage() {
        sendMessage("Good Morning");
    }

    @Scheduled(cron = "0 0 12 * * ?") // Every day at 12:00 PM
    public void sendGoodAfternoonMessage() {
        sendMessage("Good Afternoon");
    }


}
