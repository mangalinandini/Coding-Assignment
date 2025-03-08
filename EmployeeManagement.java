import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    // Constructor to initialize employee object
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("-----------------------");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating a list to store employee objects
        List<Employee> employees = new ArrayList<>();

        // Creating at least 3 employee objects
        employees.add(new Employee(101, "Tanshiq", 50000));
        employees.add(new Employee(102, "Arun", 55000));
        employees.add(new Employee(103, "Charlie", 60000));

        // Displaying the details of all employees
        System.out.println("Employee Details:");
        System.out.println("=======================");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
