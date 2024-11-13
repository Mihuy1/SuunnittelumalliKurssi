package Composite;

public class Employee implements OrganizationalComponent {

    private final String name;
    private final float salary;


    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(OrganizationalComponent organizationalComponent) {

    }

    @Override
    public void remove(OrganizationalComponent organizationalComponent) {

    }

    public float getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public String toXmlString(int indentLevel) {
        StringBuilder xmlString = new StringBuilder();
        for (int i = 0; i < indentLevel; i++) {
            xmlString.append("\t");
        }
        xmlString.append("<employee name=\"").append(name).append("\" salary=\"").append(salary).append("\"/>\n");
        return xmlString.toString();
    }
}
