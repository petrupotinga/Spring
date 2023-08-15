package Hibernate_OneToMany_bi.Entity;


import Hibernate_OneToMany_bi.Entity.Test.Department;
import Hibernate_OneToMany_bi.Entity.Test.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Department dep = new Department("IT", 300, 1200);
            Employee emp1 = new Employee("Zaur", "Trigulov", 600);
            Employee emp2 = new Employee("Elena", "Smirnova", 1000);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);
            session.beginTransaction();
            session.save(dep);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
