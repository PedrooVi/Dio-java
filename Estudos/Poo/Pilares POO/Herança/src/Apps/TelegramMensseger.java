package Apps;
public class TelegramMensseger extends ServicoMensagemInstantanea{

    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}

}
