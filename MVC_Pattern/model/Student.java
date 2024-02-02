package MVC_Pattern.model;

//Model
public class Student {
    //attributes
    private String rollNo;
    private String name;

    //getters and setters
    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo=rollNo;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
}
