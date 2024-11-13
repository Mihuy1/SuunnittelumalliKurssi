package Composite;

import java.util.ArrayList;

public class Department implements OrganizationalComponent {

    private final String name;
    private float salary;

    private ArrayList<OrganizationalComponent> organizationalComponents;

    public Department(String name) {
        this.name = name;
        organizationalComponents = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void add(OrganizationalComponent organizationalComponent) {
        organizationalComponents.add(organizationalComponent);
    }

    public void remove(OrganizationalComponent organizationalComponent) {
        organizationalComponents.remove(organizationalComponent);
    }

    public float getSalary() {
        salary = 0;
        organizationalComponents.forEach(organizationalComponent -> salary += organizationalComponent.getSalary());
        return salary;
    }

    public String toXmlString(int indentLevel) {
        StringBuilder xmlString = new StringBuilder();
        for (int i = 0; i < indentLevel; i++) {
            xmlString.append("\t");
        }
        xmlString.append("<department name=\"").append(name).append("\">\n");
        for (OrganizationalComponent organizationalComponent : organizationalComponents) {
            xmlString.append(organizationalComponent.toXmlString(indentLevel + 1));
        }
        for (int i = 0; i < indentLevel; i++) {
            xmlString.append("\t");
        }
        xmlString.append("</department>\n");
        return xmlString.toString();
    }

}
