package com.js.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.js.dto.Student;

public class StudentCrud {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("shashank");

	public boolean saveStudent(Student s) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(s);
		et.commit();

		Student s1 = em.find(Student.class, s.getId());
		if (s1 != null) {
			return true;
		} else {
			return false;
		}
	}

	public List<Student> getAllStudents() {
		String query = "select s from Student s"; // JPQL QUERY
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery(query);
		return q.getResultList();

	}

	public boolean deleteStudentById(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student s = em.find(Student.class, id);
		if (s != null) {
			et.begin();
			em.remove(s);
			et.commit();
			return true;
		} else {
			return false;
		}

	}

	public Student getStudentById(int id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Student.class, id);
	}

	public boolean updateStudent(Student s)

	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		if (s != null) {
			et.begin();
			em.merge(s);
			et.commit();
			return true;
		} else {
			return false;
		}
	}
}
