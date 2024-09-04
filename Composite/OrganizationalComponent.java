package Composite;

public interface OrganizationalComponent {

    void add(OrganizationalComponent organizationalComponent);
    void remove(OrganizationalComponent organizationalComponent);
    float getSalary();
    String toXmlString(int indentLevel);

}
