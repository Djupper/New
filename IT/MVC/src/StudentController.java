/**
 * Created by Prog on 10.08.2016.
 */
public class StudentController {
    private Student model;
    private View view;


    public StudentController(Student model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) { model.setName(name);}
    public String getStudentName(){return model.getName();}
    public void setLesson (String lesson) {model.setLesson(lesson);}
    public String getLesson() {return model.getLesson();}

    // взаимодействие
    public void updateView() {
        view.printStudentInfo(model.getName(),model.getLesson());
    }

}
