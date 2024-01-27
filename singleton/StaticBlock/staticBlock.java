package singleton.StaticBlock;

public class staticBlock {

    private static staticBlock instance;

    static{
        try{
            instance=new staticBlock();
        }catch(Exception e){

        }
    }
    
    private staticBlock(){}

    public static staticBlock getInstance(){
        return instance;
    }
}
