public class Janitor extends Employees {

    private String areaOfResponsibility;

    public Janitor(String name, String jobPosition, double salary, String department, String areaOfResponsibility) {
        super(name, jobPosition, salary, department);
        this.areaOfResponsibility = areaOfResponsibility;
    }
}
