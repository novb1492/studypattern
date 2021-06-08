package strategy;

public class Encod {

    private iencoding iencoding;

    public void setEncod (iencoding iencoding) {
        this.iencoding=iencoding;   
    }
    public String getmessege(String code) {
        return this.iencoding.encode(code);
    }
    
}
