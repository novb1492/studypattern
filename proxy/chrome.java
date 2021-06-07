package proxy;

public class chrome implements ibrowser{

    private String url;
    
    public chrome (String url) {
        this.url=url;
    }

    @Override
    public html show() {
        System.out.println("chrome loading html from"+url);
        return new html(url);
    }
}
