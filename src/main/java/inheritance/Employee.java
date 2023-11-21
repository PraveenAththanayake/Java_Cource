package inheritance;

public class Employee extends Person {
    private String employeeId;
    private String title;

    public Employee() {
        super("Praveen");
        System.out.println("Inside Employee:Constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
