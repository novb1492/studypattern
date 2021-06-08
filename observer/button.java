package observer;

public class button {
    
    private String name;
    private ilistener ilistener;
    public button (String name) {
        this.name=name;
    } 
    public void click(String messege) {
        ilistener.clicklistener(messege);
    }
    public void addlistener(ilistener ilistener) {
         this.ilistener=ilistener;
    }
}
