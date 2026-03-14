package singleton;

public class Configuracao {

    private static Configuracao instancia;

    private String nomeSistema;

    private Configuracao() {
        this.nomeSistema = "Sistema de Notificações";
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getNomeSistema() {
        return nomeSistema;
    }
}
