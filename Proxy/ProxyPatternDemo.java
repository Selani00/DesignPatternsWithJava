package Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args){
        Proxy.image image= new ProxyImage("test_10mb.jpg");

        //Image will load from disk
        image.display();
        System.out.println("");

        //Here image will not load from disk again
        image.display();
    }
    
}
