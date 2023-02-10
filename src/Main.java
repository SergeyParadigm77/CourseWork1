import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.printAll();
        employeeBook.monthSalary();
        employeeBook.minSalary();
        employeeBook.maxSalary();
        employeeBook.averageSalary();
        employeeBook.printAllNames();
        employeeBook.salaryIndexationAll(10);
        employeeBook.minDepartmentSalary(5);
        employeeBook.maxDepartmentSalary(4);
        employeeBook.monthDepartmentSalary(3);
        employeeBook.averageDepartmentSalary(2);
        employeeBook.salaryIndexationDepartment(1,12);
        employeeBook.printAllWithoutDepartment(1);
        employeeBook.printNameSalaryLess(300_000);
        employeeBook.printNameSalaryMoreOrEqual(440_000);
        employeeBook.removeName("Комов Петр Сергеевич");
        employeeBook.addName("Яковлев Ашот Сергеевич", 1_000_000, 1);
        employeeBook.changeSalaryDepartment("Гринев Владимир Сергеевич", 600_000, 1);
        employeeBook.printAllNamePerDepartment();
        employeeBook.printAll();//выводим полный список сотрудников чтобы убедиться что все предыдущие методы отработали корректно
    }
}
