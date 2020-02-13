
package com.research24x7.hibernate.beginners.test;


import java.util.Date;
import java.util.List;

import com.research24x7.hibernate.beginners.entity.Employee;
import com.research24x7.hibernate.beginners.util.HibernateUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name =  "Employee")
@Table(name = "employee")
public class Employee {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="emp_id", nullable=false, unique=true)
    private int id;

    @Column(name="emp_name", length=28, nullable=false)
    private String name;

    @Column(name="emp_last_name", length=28, nullable=false)
    private String lastName;

    @Column(name="emp_dni", nullable=false)
    private long dni;

    @Column(name="emp_email", nullable=false)
    private String email;

    @Column(name="emp_dni", nullable=false)
    private String mobile;


    public Employee() {

        super ();
    }

    public Employee(String name, String role, Date insertTime) {

        super ();

        this.name = name;
        this.role = role;
        this.insertTime = insertTime;
    }


    public int getId () {

        return this.id;
    }

    public void setId (int id) {

        this.id = id;
    }

    public String getName () {

        return this.name;
    }

    public void setName (String name) {

        this.name = name;
    }

    public String getRole () {

        return this.role;
    }

    public void setRole (String role) {

        this.role = role;
    }

    public Date getInsertTime () {

        return this.insertTime;
    }

    public void setInsertTime (Date insertTime) {

        this.insertTime = insertTime;
    }
}
public class HibernateAnnotationTest {


    private static SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger(HibernateAnnotationTest.class);


    public HibernateAnnotationTest() {

        super();
    }


    @BeforeAll
    public static void setup() {

        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @AfterAll
    public static void destroy() {

        sessionFactory.close();
    }


    @{...}
    @DisplayName("Create New Records")
    public void m1() {

    }
}

