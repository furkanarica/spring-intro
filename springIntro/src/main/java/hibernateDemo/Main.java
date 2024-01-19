package hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// select();
		// insert();
		// update();
		//delete();
		otherQuerys();
	}

	public static void select() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Category.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			List<Category> categories = session.createQuery("from Category").getResultList();

			for (Category category : categories) {
				System.out.println(category.getId() + " - " + category.getName());
			}

			session.getTransaction().commit();
		} finally {
			factory.close();
		}

	}

	public static void insert() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			Actor actor = new Actor("Furkan", "Arıca");
			session.persist(actor);
			session.getTransaction().commit();
			System.out.println("Actor added to database");
		} finally {
			factory.close();
		}
	}

	public static void update() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			Actor actor = session.get(Actor.class, 201);
			actor.setFirstName("FURKAN");
			actor.setLastName("ARICA");
			session.persist(actor);
			session.getTransaction().commit();
			System.out.println("Actor updated");
		} finally {
			factory.close();
		}
	}

	public static void delete() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			Actor actor = session.get(Actor.class, 201);
			session.remove(actor);
			session.getTransaction().commit();
			System.out.println("Actor deleted from database");
		} finally {
			factory.close();
		}
	}

	public static void otherQuerys() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			String hqlWhere = "from Actor a where a.firstName LIKE 'A%'";
			String hqlOrderBy = "from Actor a ORDER BY a.firstName";
			List<Actor> actors = session.createQuery(hqlOrderBy).getResultList();
			for (Actor actor : actors) {
				System.out.println(actor.getFirstName() + " " + actor.getlastName());
			}
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
		
	}
}
