package DeepSkilling.DesignPrinciples;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Employee emp = new Employee("Varun");

        EmployeeRepository repo = new EmployeeRepository();
        repo.saveEmployee(emp);

        EmailService email = new EmailService();
        email.sendEmail(emp);
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class EmployeeRepository {
    public void saveEmployee(Employee e) {
        System.out.println("Employee is saved");
    }
}

class EmailService {
    public void sendEmail(Employee e) {
        System.out.println("Email sent successfully");
    }
}
