import java.util.Map;

public class GeradorArquivoXML extends GeradorArquivo {

  public GeradorArquivoXML(Processador processador) {
    super(processador);
  }
  
  @Override
  protected String gerarConteudo(Map<String, Object> propriedades) {
    
    StringBuilder propFileBuilder = new StringBuilder();
    propFileBuilder.append("<propriedades>");
    for(String prop : propriedades.keySet()) {
      propFileBuilder.append("<"+prop+">"+propriedades.get(prop)+"</"+prop+">");
    }
    propFileBuilder.append("</propriedades>");
    
    return propFileBuilder.toString();
  }
}
