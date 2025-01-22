package model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;
    private String TeacherName;
    private String salary;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Department department;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="address_id")
    private Address address;

    @ManyToMany
    private Set<Cohort> cohortList;

    public Teacher(){}

    public Teacher(int teacherId, String TeacherName, String salary) {
        super();
        this.teacherId = teacherId;
        this.TeacherName = TeacherName;
        this.salary = salary;
    }

    public Teacher(String salary, String TeacherName, Set<Cohort> cohortList) {
        super();
        this.salary = salary;
        this.TeacherName = TeacherName;
        this.cohortList = cohortList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return this.teacherId;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Cohort> getCohortList() {
        return cohortList;
    }

    public void setCohortList(Set<Cohort> cohortList) {
        this.cohortList = cohortList;
    }
}
