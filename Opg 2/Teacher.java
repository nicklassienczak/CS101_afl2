import java.util.ArrayList;

public class Teacher extends Employees {

    private ArrayList<String> classes;

    public Teacher(String name, String jobPosition, double salary, String department, ArrayList<String> classes) {
        super(name, jobPosition, salary, department);
        this.classes = classes;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }
}
