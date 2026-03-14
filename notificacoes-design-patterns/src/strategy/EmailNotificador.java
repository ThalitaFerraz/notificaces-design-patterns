package strategy;

public class EmailNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
