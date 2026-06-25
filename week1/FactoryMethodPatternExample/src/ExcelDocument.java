class ExcelDocument implements Document{
    @Override
    public void open(){
        System.out.println("You have opened the Excel Document");
    }
    @Override
    public void edit(){
        System.out.println("You are editing the Excel Document");
    }
}