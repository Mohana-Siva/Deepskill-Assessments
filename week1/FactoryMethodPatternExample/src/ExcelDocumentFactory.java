class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        ExcelDocument Excel = new ExcelDocument();
        return Excel;
    }
}