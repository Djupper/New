/**
 * Created by Prog on 08.08.2016.
 */
public class MVCMain {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDB();

        View view = new View();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Joe");

        controller.updateView();


    }
    private static Student retrieveStudentFromDB(){
        Student student = new Student();
        student.setName("Ivan");
        student.setLesson("JavaRush");
        return student;
    }
}
