package service;

import strategy.Notificador;

public class ServicoNotificacao {

    private Notificador notificador;

    public ServicoNotificacao(Notificador notificador) {
        this.notificador = notificador;
    }

    public void processarEnvio(String mensagem) {
        System.out.println("Processando notificação...");
        notificador.enviar(mensagem);
        System.out.println("Notificação enviada com sucesso.");
    }
}
