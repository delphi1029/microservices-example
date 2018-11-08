package com.hibernate.HibernateDemoApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.HibernateDemoApp.entity.Course;
import com.hibernate.HibernateDemoApp.entity.Instructor;
import com.hibernate.HibernateDemoApp.entity.InstructorDetail;
import com.hibernate.HibernateDemoApp.entity.Review;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
    	   SessionFactory factory = new Configuration()
    			   					.configure("hibernate.cfg.xml")
    			   					.addAnnotatedClass(Instructor.class)
    			   					.addAnnotatedClass(InstructorDetail.class)
    			   					.addAnnotatedClass(Course.class)
    			   					.addAnnotatedClass(Review.class)
    			   					.buildSessionFactory();
    	   
    	  Session session = null;
    	try {
    		
    		Instructor ins = new Instructor("Sunny","Lamba","ss@ss.com");
    		InstructorDetail detail = new InstructorDetail("youtube://abc.channel","driving");
    		ins.setInstructorDetail(detail);
    		
    		Course c1 = new Course("Title 12");
    		Course c2 = new Course("Title 22");
    		Course c3 = new Course("Title 32");
    		Course c4 = new Course("Title 42");
    		Course c5 = new Course("Title 52");
    		
    		c1.addReview(new Review("Hello"));
    		c1.addReview(new Review("Hi"));
    		c2.addReview(new Review("file"));
    		c2.addReview(new Review("Good"));
    		
    		ins.addCourse(c1);
    		ins.addCourse(c2);
    		ins.addCourse(c3);
    		ins.addCourse(c4);
    		ins.addCourse(c5);
    		
    		
   
    		session = factory.getCurrentSession();
    		Transaction trans = session.beginTransaction();
    		//session.save(ins);
    		//System.out.println("hello");
    		Instructor i = session.get(Instructor.class, 5L);
    		trans.commit();
    		//session.close();
      		//System.out.println(ins.toString());
       } catch(Exception ex) {
    	   ex.printStackTrace();
       }
    	   finally {
    	   System.exit(0);
       }
    }
}
