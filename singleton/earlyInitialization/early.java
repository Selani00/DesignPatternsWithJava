package singleton.earlyInitialization;

public class early {
    private static early instance=new early();

    private early(){}

    public static early getInstance(){
        return instance;
    }
    
}
