package com.trainingapps.empms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        demo.runApp();
    }

    public void runApp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("empms");
        EntityManager em1 = emf.createEntityManager();
        EntityTransaction transaction1 = em1.getTransaction();
        transaction1.begin();
        Employee employee1 = new Employee("surya", 21);
        em1.persist(employee1);
        long id= employee1.getId();
        transaction1.commit();
        System.out.println("****displaying inserted employee");
        display(employee1);
        em1.close();

        EntityManager em2=emf.createEntityManager();
        Employee found=em2.find(Employee.class,id);
        System.out.println("found employed by id "+id);
        display(found);
        em2.close();

        EntityManager em3=emf.createEntityManager();
        EntityTransaction transaction3=em3.getTransaction();
        transaction3.begin();
        employee1.setName("surya ganneshwari");
        employee1.setAge(22);
        em3.merge(employee1);
        transaction3.commit();
        System.out.println("***employee details changed");
        display(employee1);
        em3.close();
        emf.close();

    }

    void display(Employee employee) {
        System.out.println("employee -" + employee.getId() + "-" + employee.getName()+"-" + employee.getAge());
    }


}
