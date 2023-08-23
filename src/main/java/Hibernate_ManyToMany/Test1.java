package Hibernate_ManyToMany;

import Hibernate_ManyToMany.Entity.Child;
import Hibernate_ManyToMany.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            Section section1 = new Section("Dance");
            Child child1 = new Child("Olya", 12);
            Child child2 = new Child("Grisa", 8);
            Child child3 = new Child("Pavlic", 9);

            session.beginTransaction();

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.save(child1);
            session.save(child2);
            session.save(child3);
            
            session.getTransaction().commit();
            System.out.println("Cu succes!");
//  *****************************************************

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//            session.getTransaction().commit();
//            System.out.println("Cu succes!");
//  ***************************************************************

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//            session.getTransaction().commit();
//            System.out.println("Cu succes!");
//            ******************************************************

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 5);
//            session.delete(section);
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            ******************************************************

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Child child = session.get(Child.class, 5);
//            session.delete(child);
//            session.getTransaction().commit();
//            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
