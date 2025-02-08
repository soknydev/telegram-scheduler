package telegramscheduler.telegramscheduler.controller;

import org.springframework.web.bind.annotation.*;
import telegramscheduler.telegramscheduler.service.TelegramService;

@RestController
@RequestMapping("/telegram")
public class TelegramController {

    private final TelegramService telegramService;

    public TelegramController(TelegramService telegramService) {
        this.telegramService = telegramService;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        return telegramService.sendMessage(message);
    }


}

