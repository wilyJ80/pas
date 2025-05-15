package PADROESroteiros.roteiro3.parte4;

public class NotificacaoWhatsapp implements NotificacaoStrategy {

	@Override
	public void enviarMensagem(String destinatario, String mensagem) {
		System.out.println("--------------------------");
		System.out.println("WhatsApp enviado para " + destinatario + ": \n" + mensagem);
	}
}
