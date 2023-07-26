package com.trainingapps.empms;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo2 {

    private EntityManager em;

    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.runApp();
    }


    public void runApp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("empms");
        em = emf.createEntityManager();

        Employee employee1 = add("surya", 21);
        Employee employee2=add("srinivas",22);
        long id = employee1.getId();
        System.out.println("****displaying inserted employee");
        display(employee1);
        display(employee2);

        Employee found=findById(id);
        System.out.println("***found employee by id="+id);
        display(found);

        employee1.setName("surya ganneshwari");
        employee1.setAge(22);
        update(employee1);
        System.out.println("***employee details changed");
        display(employee1);


        em.close();
        emf.close();

    }

    Employee add(String name, int age) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Employee employee = new Employee(name,age);
        em.persist(employee);
        transaction.commit();
        return employee;
    }

    Employee update(Employee employee) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(employee);
        transaction.commit();
        return employee;
    }

    Employee findById(long id) {
        Employee found = em.find(Employee.class, id);
        return found;
    }

    void display(Employee employee) {
        System.out.println("employee -" + employee.getId() + "-" + employee.getName() + "-" + employee.getAge());
    }


}
