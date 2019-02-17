package main;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Manager {
    private int id;
    private String first;
    private String lastName;
    private String department;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FIRST_")
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "DEPARTMENT")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return id == manager.id &&
                Objects.equals(first, manager.first) &&
                Objects.equals(lastName, manager.lastName) &&
                Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first, lastName, department);
    }
}
