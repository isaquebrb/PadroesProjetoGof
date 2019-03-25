
public class LogService implements Observador {

	@Override
	public void NovoArquivoGerado(String nomeArquivo, String conteudo) {
		System.out.println("Novo arquivo gerado de nome: "+nomeArquivo+" de conteúdo "+conteudo);
		
	}

}
