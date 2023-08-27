package Document;

public class DocumentChecker {
    public static void main(String[] args) {
        ExcelDocument document = new ExcelDocument();
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        excelDocument.getDesctiption();
        pdfDocument.getDesctiption();
    }
}
