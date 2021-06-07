package proxy;

public class whail  implements ibrowser{
    
    private String url;
    private html html;
    public whail (String url) {
        this.url=url;
    }
    
    @Override
    public html show() {
        if(html==null){
            this.html=new html(url);
            System.out.println("whail loading html from"+url);
        }
        System.out.println("whail cache html from"+url);
        return html;
    }
}
