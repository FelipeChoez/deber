package com.personas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.entidad.Persona;
import com.entidad.Raking;
import com.entidad.Skill;


public class Main {

	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();

  public static void main(String[] args) {
	   Persona persona1 = new Persona("felipe");
	   ingresarPesona(persona1);
	   Persona persona2 = new Persona("ronald");
	   ingresarPesona(persona2);
	  
	   Raking raking = new Raking(1);
	   ingresarRaking(raking);
	   Raking raking2 = new Raking(2);
	  ingresarRaking(raking2);
	  
	  Skill skill = new Skill("programacion");
	  ingresarSkill(skill);
	  
	  Skill skill2 = new Skill("base de datos");
	  ingresarSkill(skill2);
	  
  }
  

	static void ingresarPesona(Persona persona) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(persona);
		session.getTransaction().commit();
		session.close();
	}

	
	static void ingresarRaking(Raking raking) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(raking);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresarSkill(Skill skill) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(skill);
		session.getTransaction().commit();
		session.close();
	}
}



