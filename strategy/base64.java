package strategy;

import java.util.Base64;

public class base64 implements iencoding {
    @Override
    public String encode(String code) {
        
        return Base64.getEncoder().encodeToString(code.getBytes());
    }
}
