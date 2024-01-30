package Proxy;

public class ProxyImage implements image {
    private RealImage realImage;
    private String fileName;
    //constructor
    public ProxyImage(String fileName){
        this.fileName=fileName;//this is the file name of the image
        //this.fileName is a instance variable 
    }

    @Override
    public void display(){
        if(realImage==null){
            //Here the real image get instantionated. If it not happend? 
            realImage=new RealImage(fileName);
        }
        realImage.display();
    }
    
}
