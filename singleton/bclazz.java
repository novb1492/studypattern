package singleton;

public class bclazz {
    
    private socket socket;
    
    public bclazz () {
        this.socket=socket.getinstance();
    }
    public socket gSocket() {
        return this.socket;
    }
}
