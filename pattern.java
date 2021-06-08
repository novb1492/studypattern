import java.beans.Encoder;

import adapter.cleanup;
import adapter.e110v;
import adapter.socketadapter;
import adapter.tv;
import decorator.a3;
import decorator.a4;
import decorator.audi;
import decorator.icar;
import observer.button;
import observer.ilistener;
import proxy.chrome;
import proxy.ibrowser;
import proxy.whail;
import singleton.aclazz;
import singleton.bclazz;
import singleton.socket;
import strategy.Encod;
import strategy.base64;
import strategy.iencoding;
import strategy.normal;

public class pattern {
    
    public static void main(String[] args) {
        System.out.println("main");
        
        System.out.println("싱글톤");
        
        aclazz aclazz=new aclazz();
        bclazz bclazz=new bclazz();

        socket socketa=aclazz.gSocket();
        socket socketb=bclazz.gSocket();

        System.out.println(socketa.equals(socketb));
        System.out.println("=========================");
        ///////////////////////////////////////////싱글톤

        System.out.println("adapter패턴");
        tv tv=new tv();
        connect(tv);
        cleanup cleanup=new cleanup();
        //connect(cleanup);
        //어뎁터구매
        e110v e110v=new socketadapter(cleanup);
        connect(e110v);
        System.out.println("=========================");
        ///////adapter패턴

        System.out.println("proxy패턴");
        chrome chrome=new chrome("naver.com");
        chrome.show();
        chrome.show();
        chrome.show();
        chrome.show();
        //매번받아옴
        ibrowser ibrowser=new whail("daum.net");
        ibrowser.show();
        ibrowser.show();
        ibrowser.show();
        ibrowser.show();
        ibrowser.show();
        //캐시가된다
        System.out.println("=========================");
        ///////proxy패턴

        System.out.println("decorator패턴");

        icar audi=new audi(100);
        audi.show();
        icar a3=new a3(audi, "a3");
        a3.show();
        icar a4=new a4(audi, "a4");
        a4.show();
        System.out.println("=========================");
        ///////decorater패턴

        System.out.println("observer패턴");
        button button=new button("버튼");
        button.addlistener(new ilistener(){
            @Override
            public void clicklistener(String event) {
                System.out.println(event);
            }
        });
        button.click("1");
        button.click("2");
        button.click("3");
        System.out.println("=========================");
        ///////observer패턴

        System.out.println("strategy패턴");

       Encod encod=new Encod();
        iencoding base=new base64();
        iencoding noaml=new normal();

        String code="hello";
        
        encod.setEncod(base);
        String ou=encod.getmessege(code);
        System.out.println("base"+ou);

        encod.setEncod(noaml);
        String ou2=encod.getmessege(code);
        System.out.println("noaml"+ou2);

    }
    public static void connect(e110v e110v) {
        e110v.poweron();
    }
   
}
