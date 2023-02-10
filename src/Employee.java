public class Employee {
    private int department;
    private int id;
    private String name;
    private int salary;

    private static int counter = 0;//обьявляем счетчик;
public Employee(String name, int salary, int department) {
    this.id = ++counter;
    this.name = name;
    this.salary = salary;
    this.department = department;
}

    public int getDepartment() {
        return department;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "Id сотрудника: " + id + " " +
                "Имя сотрудника: " + name +  " " +
                "Номер отдела: " + department + " " +
                "Зарплата сотрудника: " + salary;
    }
}