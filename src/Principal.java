import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {
  
  public static void main(String[] args)  throws IOException {
    Map<String,Object> mapa = new HashMap<>();
    mapa.put("nome","carlos");
    mapa.put("idade",32);
    
    GeradorArquivo gerador = new GeradorArquivoPropriedades(new ProcessaCriptografado());
    gerador.gerarArquivo("C:\\Users\\iribeirb\\Desktop\\Cript.txt", mapa);
    
    GeradorArquivo gerador1 = new GeradorArquivoXML(new ProcessaCompactado());
    gerador1.gerarArquivo("C:\\Users\\iribeirb\\Desktop\\XML.zip", mapa);
    
    GeradorArquivo gerador2 = new GeradorArquivoPropriedades(new ProcessaDefault());
    gerador2.gerarArquivo("C:\\Users\\iribeirb\\Desktop\\default.txt", mapa);

  }
}
