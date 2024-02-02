package MVC_Pattern;

import MVC_Pattern.controller.StudentController;
import MVC_Pattern.model.Student;
import MVC_Pattern.view.StudentView;

public class MVC_main {
    public static void main(String[] args){
        // fetch student data from data base
        Student model=retriveStudentFromDatabase();

        StudentView view=new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("Selani");
        controller.updateView();
    }



    private static Student retriveStudentFromDatabase() {
        Student student= new Student();
        student.setName("Selani");
        student.setRollNo("10");
        return student;
    } 
    
}
