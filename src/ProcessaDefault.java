import java.io.IOException;

public class ProcessaDefault extends Processador{
	
	public ProcessaDefault(Processador proximo) {
		super(proximo);
	}
	
	public ProcessaDefault() {
		
	}
	
  @Override
  public byte[] processaConteudo(byte[] conteudo) throws IOException{
    return conteudo;
  }
}
