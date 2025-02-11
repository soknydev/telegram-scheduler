package telegramscheduler.telegramscheduler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TelegramServiceImpl extends TelegramService {

    /*private int counter = 0;

    // Send a message every 10 seconds (Alternating hello, hello, hi)
    @Scheduled(fixedRate = 20000)
    public void sendScheduledMessage() {
        String message = (counter % 3 == 0 || counter % 3 == 1) ? "hello " : "hi";
        sendMessage(message);
        System.out.println("Message sent: " + message);
        counter++;
    }*/


    /*@Scheduled(cron = "0 47 14 * * ?")
    public void sendMessage() {
        String message = "";
        sendMessage("សួសួស្ដីបាទ");
        log.info("Message: សួស្ដី");
    }*/

    @Scheduled(cron = "30 30 16 * * ?")
    public void sendCheckOut(){
        String message = "ដល់ម៉ោងចេញហើយ...!";
        sendMessage(message);
        log.info("Sent {}", message);
    }

    @Scheduled(cron = "0 0 12 * * ?")
    public void sendCheckOut1(){
        String message = "ដល់ម៉ោងបាយហើយ...!";
        sendMessage(message);
        log.info("Sent {}", message);
    }

    @Scheduled(cron = "0 0 13 * * ?")
    public void sendCheckIn(){
        String message = "ដល់ម៉ោងស្កែនដៃហើយ សូមទៅស្កែនឥឡូវនេះ...!";
        sendMessage(message);
        log.info("Sent {}", message);
    }


}
