package singleton;

public class SingletonPatternDemo {
    public static void main(String[] arg){
        //illegal construct
        //Compile Time Error: The constructor SingletonObject() is not visible
        //SingletonObject object = new SingletonObject();
        
        //Get the only object available
        SingletonObject object = SingletonObject.getInstance();
        
        //show the message
        object.showMessage();
    }
    
}
