package be.infernalwhale.model;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private Integer id;

    private String firstname;
    private String familyname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne
    private Course course;

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Person setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getFamilyname() {
        return familyname;
    }

    public Person setFamilyname(String familyname) {
        this.familyname = familyname;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Course getCourse() {
        return course;
    }

    public Person setCourse(Course course) {
        this.course = course;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", familyname='" + familyname + '\'' +
                ", gender=" + gender +
                ", course=" + course +
                '}';
    }
}
