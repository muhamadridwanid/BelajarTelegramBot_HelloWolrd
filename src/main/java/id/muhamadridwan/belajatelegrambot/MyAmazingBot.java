/*
 * Copyright PT. Swamedia Informatika
 */
package id.muhamadridwan.belajatelegrambot;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 *
 * @author Muhamad Ridwan  <muhamadridwan.info@gmail.com>
 */
public class MyAmazingBot extends TelegramLongPollingBot {

    @Override
    public String getBotToken() {
        return "256320288:AAE4IEX16p2-Oiwu4vg82_CfV8WCkU312qs";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            
            SendMessage sendMessage = new SendMessage()
                    .setChatId(chatId)
                    .setText(message);
            try {
                sendMessage(sendMessage);
            } catch (TelegramApiException ex) {
                Logger.getLogger(MyAmazingBot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "Belajar_Telegram_bot";
    }

}
