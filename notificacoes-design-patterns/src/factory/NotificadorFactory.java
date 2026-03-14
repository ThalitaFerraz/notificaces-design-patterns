package factory;

import strategy.EmailNotificador;
import strategy.Notificador;
import strategy.SmsNotificador;
import strategy.WhatsAppNotificador;

public class NotificadorFactory {

    public static Notificador criarNotificador(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de notificador não pode ser nulo.");
        }

        switch (tipo.toLowerCase()) {
            case "email":
                return new EmailNotificador();
            case "sms":
                return new SmsNotificador();
            case "whatsapp":
                return new WhatsAppNotificador();
            default:
                throw new IllegalArgumentException("Tipo de notificador inválido: " + tipo);
        }
    }
}
