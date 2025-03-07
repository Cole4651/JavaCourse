

public class EmployeeTest{
    public static void main(String[] args) {
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        System.out.println(susan);
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        System.out.println(mark);
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.println(joy);
        Employee test = new Employee("John Doe", 12345, "Loafer", "Professional");
        System.out.println(test);
    }
}
