class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        WordDocument word = new WordDocument();
        return word;
    }
}