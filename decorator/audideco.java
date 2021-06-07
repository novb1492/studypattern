package decorator;

public class audideco implements icar{
    
    protected icar audi;
    protected String model;
    protected int modelprice;

    public audideco (icar audi,String model,int modelprice) {
        this.audi=audi;
        this.model=model;
        this.modelprice=modelprice;
    }
    @Override
    public int getprice() {
        
        return audi.getprice()+modelprice;
    }
    @Override
    public void show() {
        System.out.println(model+"$"+getprice());
        
    }
}
