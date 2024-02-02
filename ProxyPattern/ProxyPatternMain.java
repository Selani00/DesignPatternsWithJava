package ProxyPattern;

public class ProxyPatternMain {
    public static void main(String[] args){
        Image image = new ProxyImage("test_10.jpg");
        
        //image will be loaded from disk
        image.display();
        System.out.println("");
        
        //image will not be loaded from disk
        image.display();
    }
    
}
