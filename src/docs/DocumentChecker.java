package docs;

public class DocumentChecker {
    public static void main(String[] args) {
        Document doc = new ExcelDocument();
        Document doc2 = new PdfDocument();
        doc.getDescription();
        doc2.getDescription();
    }
}
