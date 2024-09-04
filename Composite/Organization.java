package Composite;

public class Organization {

    // Root department
    private final Department rootDepartment = new Department("Root");


    public void addDepartmentOrEmployee(OrganizationalComponent component) {
        rootDepartment.add(component);
    }

    public void removeDepartmentOrEmployee(OrganizationalComponent component) {
        rootDepartment.remove(component);
    }

    public float totalSalary() {
       return rootDepartment.getSalary();
    }

    public String toXmlString(int indentLevel) {
        return rootDepartment.toXmlString(indentLevel);
    }
}
