package decoratorPatter;

public abstract class ShapeDecorator implements Shape{
    // protected used to allow subclasses to access the variable
    protected Shape decoratedShape;//instance variable
    
    //constructor
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    
    public void draw(){
        decoratedShape.draw();
    }
    
}  
