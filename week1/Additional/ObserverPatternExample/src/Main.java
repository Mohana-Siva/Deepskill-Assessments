import java.util.ArrayList;
import java.util.List;

//flow -> StockMarket : setStock() -> notifyObs() -> obs.update();

class MobileApp implements Observer{
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double price) {        //update the particular observar's stock price
        System.out.println("Mobile App user: " + user + " : "
                + stockName + " price updated to Rs." + price+"\n");
    }
}

class WebApp implements Observer{
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Web App user: " + user + " : "
                + stockName + " price updated to Rs." + price+"\n");
    }
}

class StockMarket implements Stock{
    List<Observer> observers = new ArrayList<>(); //here we are storing all the stock market users in the observers list
    private String stockname;
    private double price;

    @Override
    public void register(Observer observer){
        observers.add(observer); 
    }

    @Override
    public void deregister(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyobs(){
        for(Observer obs : observers){
            obs.update(stockname, price); //calls the internal update method of each observer
        }
    }

    public void setStock(String stockname , double price){
        this.stockname = stockname;
        this.price = price;
        notifyobs(); //calling notifyobs when a change occurs
    }


}
public class Main {

    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobile = new MobileApp("Alice");
        Observer web = new WebApp("Bob");

        stockMarket.register(mobile);
        stockMarket.register(web);
        
        stockMarket.setStock("Zomato", 1100.6);
        stockMarket.setStock("Swiggy", 2000.0);

        stockMarket.setStock("Zomato", 1000.0);

        stockMarket.deregister(web);

        stockMarket.setStock("Zomato", 1500.0);

        
    }
        

        

        
    
}
