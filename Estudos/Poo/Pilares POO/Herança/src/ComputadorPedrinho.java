import Apps.FacebookMensseger;
import Apps.MSNMessenger;
import Apps.ServicoMensagemInstantanea;
import Apps.TelegramMensseger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMensseger();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramMensseger();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}