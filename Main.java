public class Main {
    public static void main(String[] args) {
        NotaNegociacaoBuilder pdfBuilder = new PdfNotaNegociacaoBuilder();
        NotaNegociacaoDirector director = new NotaNegociacaoDirector(pdfBuilder);
        director.construirNota();
        NotaNegociacao notaPdf = pdfBuilder.getNota();
        System.out.println("Nota em PDF: ");
        System.out.println(notaPdf.getConteudo());

        NotaNegociacaoBuilder xmlBuilder = new XmlNotaNegociacaoBuilder();
        director = new NotaNegociacaoDirector(xmlBuilder);
        director.construirNota();
        NotaNegociacao notaXml = xmlBuilder.getNota();
        System.out.println("Nota em XML: ");
        System.out.println(notaXml.getConteudo());

       NotaNegociacaoBuilder xlsBuilder = new XlsNotaNegociacaoBuilder();
        director = new NotaNegociacaoDirector(xlsBuilder);
        director.construirNota();
        NotaNegociacao notaXls = xlsBuilder.getNota();
        System.out.println("Nota em XLS: ");
        System.out.println(notaXls.getConteudo());
    }
}
