public class WordDocument implements Document{
    @Override
  public  void open(){
        System.out.println("You have opened the Word Document");
    }
    @Override
  public  void edit(){
        System.out.println("You are editing the Word Document");
    }
}