/*
 * Copyright PT. Swamedia Informatika
 */
package id.muhamadridwan.belajatelegrambot;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;

/**
 *
 * @author Muhamad Ridwan  <muhamadridwan.info@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();
        try {
            botsApi.registerBot(new MyAmazingBot());
        } catch (Exception e) {
        }
    }
}
