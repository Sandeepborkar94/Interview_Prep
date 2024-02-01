package hibernate.practice.first;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernate_Util 
{
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	
	public static SessionFactory getSessionFactory() 
	{
		if(sessionFactory==null) 
		{
			registry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources mds = new MetadataSources(registry);
			Metadata md = mds.getMetadataBuilder().build();
			sessionFactory = md.getSessionFactoryBuilder().build();
		}
		
		
		return sessionFactory;
		
	}
	
	
}
