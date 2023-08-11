package Hibernate_test2.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Misha", "Sidorov", "HR", 850);
//            Details details = new Details("London", "26464544", "mishanya@gmail.com");
//            employee.setEmpDetails(details);
//            details.setEmployee(employee);
//            session.beginTransaction();
//            session.save(details);
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Details details = session.get(Details.class, 3);
//            System.out.println(details.getEmployee());
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Details details = session.get(Details.class, 3);
//            details.getEmployee().setEmpDetails(null);
            session.delete(details);
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}

