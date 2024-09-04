package Composite;

public class Main {

    public static void main(String[] args) {

        Organization organization = new Organization();

        Department department1 = new Department("Department 1");
        Department department2 = new Department("Department 2");

        Employee employee1 = new Employee("John Doe", 3000);
        Employee employee2 = new Employee("Jane Doe", 5000);

        department1.add(employee1);
        department2.add(employee2);

        organization.addDepartmentOrEmployee(department1);
        organization.addDepartmentOrEmployee(department2);

        System.out.println(organization.totalSalary());
        System.out.println(organization.toXmlString(0));

        // Remove an employee
        department2.remove(employee2);

        System.out.println("After removing an employee:");
        System.out.println("Total salary: " + organization.totalSalary());
        System.out.println("Department2 salary " + department2.getSalary());
        System.out.println(organization.toXmlString(0));
    }
}
