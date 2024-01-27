package singleton.threadSafe;

public class threadSafe {
    private static threadSafe instance;

    private threadSafe(){}

    public static threadSafe getInstance(){
        synchronized(threadSafe.class){
            if(instance==null){
                instance=new threadSafe();
            }
        }
        return instance;

    }

    
}
