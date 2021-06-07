package decorator;

public class audi implements icar{
    
    private int price;

    public audi (int price) {
        this.price=price;
    }
    
    @Override
    public int getprice() {
        
        return price;
    }
    @Override
    public void show() {
        System.out.println("audi $ "+price);
    }
}
