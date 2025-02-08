package telegramscheduler.telegramscheduler.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public abstract class TelegramService {

    @Value("${telegram.bot-token}")
    protected String botToken;

    @Value("${telegram.chat-id}")
    protected String chatId;

    protected final RestTemplate restTemplate = new RestTemplate();

    public String sendMessage(String message) {
        String url = "https://api.telegram.org/bot" + botToken + "/sendMessage"
                + "?chat_id=" + chatId + "&text=" + message;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }


}
