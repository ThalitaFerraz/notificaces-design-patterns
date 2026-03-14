package app;

import factory.NotificadorFactory;
import service.ServicoNotificacao;
import singleton.Configuracao;
import strategy.Notificador;

public class Main {
    public static void main(String[] args) {

        Configuracao config = Configuracao.getInstancia();
        System.out.println("Sistema: " + config.getNomeSistema());

        Notificador notificador = NotificadorFactory.criarNotificador("email");
        ServicoNotificacao servico = new ServicoNotificacao(notificador);

        servico.processarEnvio("Bem-vindo ao estudo de Design Patterns!");
    }
}
