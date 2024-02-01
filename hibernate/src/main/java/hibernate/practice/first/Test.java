package hibernate.practice.first;

import org.hibernate.Session;

public class Test
{
	public static void main(String[] args)
	{
		Session session = Hibernate_Util.getSessionFactory().openSession();
		
		
		Student student  = new Student();
		student.setSid(111);
		student.setSnmae("Sandeep");
		student.setsEmail("Sandeepborkar94@gmai.com");
		
		session.save(student);
		
	}

}
