class PdfDocumentFactory extends DocumentFactory{
    @Override  
    public PdfDocument createDocument(){
        PdfDocument Pdf = new PdfDocument();
        return Pdf;     //covariant return type PdfDocument
    }
}