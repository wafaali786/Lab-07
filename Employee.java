 public class Employee {
    double baseSalary = 30000;

    
    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus = 15000;

    
   
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}


class Worker extends Employee {
    double hourlyRate = 100;
    int hoursWorked = 160; 

    
   
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


 class Main {
    public static void main(String[] args) {
        
        Employee e = new Employee();
        System.out.println("Employee Salary: " + e.calculateSalary());

        
        Employee m = new Manager();
        System.out.println("Manager Salary: " + m.calculateSalary());

        Employee w = new Worker();
        System.out.println("Worker Salary: " + w.calculateSalary());
    }
}
