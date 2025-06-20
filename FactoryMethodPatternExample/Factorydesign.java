



interface Document{
    String read();
}
class WordDocument implements Document{
    public String read() {
        return "Reading Word Document";
    }
}
class ExcelDocument implements Document{
    public String read() {
        return "Reading Excel Document";
    }
}
class PdfDocument implements Document{
    public String read(){
        return "Reading PdfDocument";
    }
}
abstract class DocumentFactory{
    abstract Document createDocument();
}
class WordDocumentFactory extends DocumentFactory{
    public Document createDocument() {
        return new WordDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument() {
        return new ExcelDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }
}
public class Factorydesign{
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        System.out.println(wordDoc.read());

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        System.out.println(excelDoc.read());

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        System.out.println(pdfDoc.read());
    }
}