import java.util.Scanner;

// Interface para notificação por email
interface NotificacaoEmail {
    void enviarEmail(String mensagem);
}

// Interface para notificação por SMS
interface NotificacaoSMS {
    void enviarSMS(String mensagem);
}

// Implementação da notificação por email
class EmailNotification implements NotificacaoEmail {
    @Override
    public void enviarEmail(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}

// Implementação da notificação por SMS
class SMSNotification implements NotificacaoSMS {
    @Override
    public void enviarSMS(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] entradas = scanner.nextLine().split(", ");

            String tipoNotificacao = entradas[0];
            String mensagem = entradas[1];

            // Criando objetos específicos com base no tipo escolhido
            switch (tipoNotificacao) {
                case "email":
                    NotificacaoEmail notificacaoEmail = new EmailNotification();
                    notificacaoEmail.enviarEmail(mensagem);
                    break;
                case "sms":
                    NotificacaoSMS notificacaoSMS = new SMSNotification();
                    notificacaoSMS.enviarSMS(mensagem);
                    break;
                default:
                    System.out.println("Tipo de notificacao invalido.");
                    break;
            }
        }
    }
}
