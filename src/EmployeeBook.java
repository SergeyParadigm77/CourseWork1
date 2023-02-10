public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    {
        employees[0] = new Employee("Иванов Иван Иванович", 100_000, 1);
        employees[1] = new Employee("Петров Семен Иванович", 150_000, 1);
        employees[2] = new Employee("Смирнов Семен Андреевич", 175_000, 2);
        employees[3] = new Employee("Сидоров Илья Львович", 200_000, 2);
        employees[4] = new Employee("Комов Петр Сергеевич", 250_000, 3);
        employees[5] = new Employee("Громов Андрей Сергеевич", 300_000, 3);
        employees[6] = new Employee("Уланов Дмитрий Сергеевич", 350_000, 4);
        employees[7] = new Employee("Гребцов Артем Алексеевич", 400_000, 4);
        employees[8] = new Employee("Соловьев Андрей Геннадьевич", 500_000, 5);
        employees[9] = new Employee("Гринев Владимир Сергеевич", 475_000, 5);
    }

    public void removeName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().equals(name)) {
                employees[i].setName(null);
                employees[i].setDepartment(0);
                employees[i].setSalary(0);
            }
        }
    }
    public void addName(String name, int salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if ((i == employees.length - 1) && employees[i].getSalary() == 0) {
                System.out.println("В массиве нет свободных полей! Добавление нового сотрудника невозможно!");
                break;
            } else if (employees[i].getSalary() == 0) {
                employees[i].setName(name);
                employees[i].setSalary(salary);
                employees[i].setDepartment(department);
                break;
            }
        }
    }
    public void changeSalaryDepartment(String name, int salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getName().equals(name)) {
                employees[i].setSalary(salary);
                employees[i].setDepartment(department);
            }
        }
    }
    public void printAllNamePerDepartment() {
        for (int department = 1; department < 6; department++) {
            System.out.println();
            System.out.println("Список всех сотрудников отдела номер " + department + ":");
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == department) {
                    System.out.println(employees[i].getName());
                }
            }
        }
    }

    public void monthSalary() {
        System.out.println();
        int monthSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            monthSalary += employees[i].getSalary();
        }
        System.out.println("Cумма затрат на зарплаты в месяц: " + monthSalary);
    }

    public void printAll() {
        System.out.println();
        System.out.println("Список всех сотрудников компании со всеми имеющимися данными: ");
        for (int i = 0; i < employees.length; i++) {
            //System.out.println("Id: " + employees[i].getId() + ", Ф.И.О.: " + employees[i].getName() + ", зарплата: " + employees[i].getSalary() + ", отдел: " + employees[i].getDepartment());
            System.out.println(employees[i]);
        }
    }

    public void maxSalary() {
        System.out.println();
        int j = 0;
        for (int i = 1, maxSalary = employees[0].getSalary(); i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                j = i;
            }
        }
        System.out.println("Максимальная зарплата: " + employees[j].getSalary() + " у сотрудника по Ф.И.О. :" + employees[j].getName());
    }
    public int maxSalaryService() {
        int j = 0;
        for (int i = 1, maxSalary = employees[0].getSalary(); i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                j = i;
            }
        }
        return employees[j].getSalary();
    }

    public void minSalary() {
        System.out.println();
        int j = 0;
        for (int i = 1, minSalary = employees[0].getSalary(); i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                j = i;
            }
        }
        System.out.println("Минимальная зарплата: " + employees[j].getSalary() + " у сотрудника по Ф.И.О.: " + employees[j].getName());
    }
    public int minSalaryService() {
        int j = 0;
        for (int i = 1, minSalary = employees[0].getSalary(); i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                j = i;
            }
        }
        return employees[j].getSalary();
    }

    public void averageSalary() {
        System.out.println();
        int monthSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            monthSalary += employees[i].getSalary();
        }
        System.out.println("Среднее значение зарплат составляет: " + monthSalary / employees.length);
    }
    public void printAllNames() {
        System.out.println();
        System.out.println("Ф.И.О. всех сотрудников компании: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }
    public void salaryIndexationAll(int indexationFactor) {
        for (int i = 0, newSalary; i < employees.length; i++) {
            newSalary = employees[i].getSalary() * (100 + indexationFactor) / 100;
            employees[i].setSalary(newSalary);
        }
        printAll();
    }
    public void salaryIndexationDepartment(int desiredDepartment, int indexationFactor) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == desiredDepartment) {
                int newSalary = employees[i].getSalary() * (100 + indexationFactor) / 100;
                employees[i].setSalary(newSalary);
            }
        }
    }
    public void minDepartmentSalary(int desiredDepartment) {
        System.out.println();
        int j = 0, minSalary = maxSalaryService();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == desiredDepartment && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                j = i;
            }
        }
        System.out.println("В отделе номер " + desiredDepartment +  " минимальная зарплата составляет: " + employees[j].getSalary() + " у сотрудника по Ф.И.О.: " + employees[j].getName());
    }
    public void maxDepartmentSalary(int desiredDepartment) {
        System.out.println();
        int j = 0, maxSalary = minSalaryService();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == desiredDepartment && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                j = i;
            }
        }
        System.out.println("В отделе номер " + desiredDepartment +  " максимальная зарплата составляет: " + employees[j].getSalary() + " у сотрудника по Ф.И.О.: " + employees[j].getName());
    }
    public void monthDepartmentSalary(int desiredDepartment) {
        System.out.println();
        int monthDepartmentSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == desiredDepartment) {
                monthDepartmentSalary += employees[i].getSalary();
            }
        }
        System.out.println("По отделу номер " + desiredDepartment + " cумма затрат на зарплаты в месяц составляет: " + monthDepartmentSalary);
    }
    public void averageDepartmentSalary(int desiredDepartment) {
        System.out.println();
        int monthDepartmentSalary = 0, numberEmployeesDepartment = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == desiredDepartment) {
                monthDepartmentSalary += employees[i].getSalary();
                numberEmployeesDepartment++;
            }
        }
        System.out.println("По отделу номер " + desiredDepartment + " cреднее значение зарплат составляет: " + monthDepartmentSalary / numberEmployeesDepartment);
    }
    public void printAllWithoutDepartment(int desiredDepartment) {
        System.out.println();
        System.out.println("Список всех сотрудников отдела номер " + desiredDepartment + " со всеми имеющимися данными (кроме номера отдела): ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == desiredDepartment) {
                System.out.println("Id сотрудника: " + employees[i].getId() + " Имя сотрудника: " + employees[i].getName() + " Зарплата сотрудника: " + employees[i].getSalary());
            }
        }
    }
    public void printNameSalaryLess(int salaryLess) {
        System.out.println();
        System.out.println("Список всех сотрудников с зарплатой меньше " + salaryLess);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() < salaryLess) {
                System.out.println("Id сотрудника: " + employees[i].getId() + " Имя сотрудника: " + employees[i].getName() + " Зарплата сотрудника: " + employees[i].getSalary());
            }
        }
    }
    public void printNameSalaryMoreOrEqual(int salaryMoreOrEqual) {
        System.out.println();
        System.out.println("Список всех сотрудников с зарплатой больше (или равно) " + salaryMoreOrEqual);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() >= salaryMoreOrEqual) {
                System.out.println("Id сотрудника: " + employees[i].getId() + " Имя сотрудника: " + employees[i].getName() + " Зарплата сотрудника: " + employees[i].getSalary());
            }
        }
    }

}
