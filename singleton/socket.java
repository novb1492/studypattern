package singleton;

public class socket {

    private static socket socket;//맞아 싱글톤은 static이였어야함

    private socket() {}

    public static socket getinstance() {
        if(socket==null){
            socket=new socket();
        }
        return socket;
    }
    public void connect() {
        System.out.println("connect");
    }
    
}
