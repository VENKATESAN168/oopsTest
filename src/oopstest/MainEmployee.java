package oopstest;


class Employee {
    int employeeId;
    String name;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(int id, String name, int teamSize) {
        super(id, name);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String language;

    Developer(int id, String name, String language) {
        super(id, name);
        this.language = language;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + language);
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Ravi", 10);
        Developer d = new Developer(102, "Kumar", "Java");

        System.out.println("Manager Details:");
        m.displayDetails();

        System.out.println("\nDeveloper Details:");
        d.displayDetails();
    }
}


