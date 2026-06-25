public class Main{

    public static void main(String []args){
        DocumentFactory pdf_fac = new PdfDocumentFactory();
        Document p = pdf_fac.createDocument();
        System.out.println(p.getClass());
        p.open();
        p.edit();

        DocumentFactory Word_fac = new WordDocumentFactory();
        Document w = Word_fac.createDocument();
        System.out.println(w.getClass());
        w.open();
        w.edit();

        DocumentFactory Excel_fac = new ExcelDocumentFactory();
        Document e = Excel_fac.createDocument();
        System.out.println(e.getClass());
        e.open();
        e.edit();
    }
}