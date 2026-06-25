public class PdfDocument implements Document{
    @Override
  public  void open(){
        System.out.println("You have opened the Pdf Document");
    }
    @Override
  public  void edit(){
        System.out.println("You are editing the Pdf Document");
    }
}