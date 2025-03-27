
public class NotaNegociacao {
  private StringBuilder conteudo;

  public NotaNegociacao() {
    conteudo = new StringBuilder();
  }

  public void adicionarConteudo(String texto) {
    conteudo.append(texto);
  }

  public String getConteudo() {
    return conteudo.toString();
  }
}
