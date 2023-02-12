public class Headmaster extends Employees{

    int yearsOfExperience;

    public Headmaster(String name, String jobPosition, double salary, String department, int yearsOfExperience) {
        super(name, jobPosition, salary, department);
        this.yearsOfExperience = yearsOfExperience;
    }
}
