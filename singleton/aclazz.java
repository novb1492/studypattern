package singleton;

public class aclazz {
    
    private socket socket;
    
    public aclazz () {
        this.socket=socket.getinstance();
    }
    public socket gSocket() {
        return this.socket;
    }

}
