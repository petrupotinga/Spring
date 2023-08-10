package Hibernate_test2.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Zaur", "Trigulov", "IT", 500);
//            Details details = new Details("Baku", "07954875", "zaurtrigulov@gmail.com");
//            employee.setEmpDetails(details);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Elena", "Mihailov", "HR", 650);
//            Details details = new Details("Roma", "068746594", "elena@gmail.com");
//            employee.setEmpDetails(details);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class,1);

            System.out.println(employee.getEmpDetails());

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
