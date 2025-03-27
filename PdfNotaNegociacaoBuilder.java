public class PdfNotaNegociacaoBuilder implements NotaNegociacaoBuilder {
    private NotaNegociacao nota;

    public PdfNotaNegociacaoBuilder() {
        this.nota = new NotaNegociacao();
    }

    @Override
    public void buildCabecalho() {
        nota.adicionarConteudo("PDF: Cabeçalho da nota");
    }

    @Override
    public void buildOperacoes() {
        nota.adicionarConteudo("PDF: Lista de Operações");
    }

    @Override
    public void buildSumario() {
        nota.adicionarConteudo("PDF: Sumário com totais e taxas");
    }

    @Override
    public NotaNegociacao getNota() {
        return nota;
    }
}
