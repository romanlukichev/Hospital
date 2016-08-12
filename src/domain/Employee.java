package domain;

/**
 * Created by Roman on 07.08.2016.
 */
public class Employee {

    private long id;
    private String name;
    private String department;
    private boolean working;

    public Employee(boolean working, long id, String name, String department) {
        this.working = working;
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
