public class ITadmin extends Employees{

    private boolean isTechGod;

    public ITadmin(String name, String jobPosition, double salary, String department, boolean isTechGod) {
        super(name, jobPosition, salary, department);
        this.isTechGod = isTechGod;
    }
}
