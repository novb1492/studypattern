package adapter;

public class socketadapter implements e110v{
    
    private e220v e220v;

    public socketadapter(e220v e220v){
        this.e220v=e220v;
    }
    
    @Override
    public void poweron() {
        e220v.connec();
    }
}
