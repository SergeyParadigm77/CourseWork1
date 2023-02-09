public class Main {
    static Employee[] employees = new Employee[10];

    static {
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

    private static void monthSalary() {
        System.out.println();
        int monthSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            monthSalary += employees[i].getSalary();
        }
        System.out.println("Cумма затрат на зарплаты в месяц: " + monthSalary);
    }

    private static void printAll() {
        System.out.println();
        System.out.println("Список всех сотрудников компании со всеми имеющимися данными: ");
        for (int i = 0; i < employees.length; i++) {
            //System.out.println("Id: " + employees[i].getId() + ", Ф.И.О.: " + employees[i].getName() + ", зарплата: " + employees[i].getSalary() + ", отдел: " + employees[i].getDepartment());
            System.out.println(employees[i]);
        }
    }

    private static void maxSalary() {
        System.out.println();
        int j = 0;
        for (int i = 1, maxSalary = employees[0].getSalary(); i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                j = i;
            }
        }
            System.out.println("Максимальная зарплата: " + employees[j].getSalary() + " у сотрудника по Ф.И.О.:" + employees[j].getName());
    }

    private static void minSalary() {
        System.out.println();
        int j = 0;
        for (int i = 1, minSalary = employees[0].getSalary(); i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                j = i;
            }
        }
        System.out.println("Минимальная зарплата: " + employees[j].getSalary() + " у сотрудника по Ф.И.О.:" + employees[j].getName());
    }

    private static void averageSalary() {
        System.out.println();
        int monthSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            monthSalary += employees[i].getSalary();
        }
        System.out.println("Среднее значение зарплат составляет: " + monthSalary / employees.length);
    }
    private static void printAllNames() {
        System.out.println();
        System.out.println("Ф.И.О. всех сотрудников компании: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }

    public static void main(String[] args) {
        printAll();
        monthSalary();
        minSalary();
        maxSalary();
        averageSalary();
        printAllNames();
    }
}
