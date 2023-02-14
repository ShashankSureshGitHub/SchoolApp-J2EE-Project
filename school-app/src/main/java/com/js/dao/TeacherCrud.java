package com.js.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.js.dto.Teacher;

public class TeacherCrud {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("shashank");
	
	public boolean saveTeacher(Teacher t)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(t);
		et.commit();
		
		Teacher t1=em.find(Teacher.class, t.getTid());
		if(t1!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public List<Teacher> getAllTeachers()
	{
		String query="Select t from Teacher t";
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery(query);
		return q.getResultList();
	}
	
	public boolean deleteTeacherById(int id)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Teacher t=em.find(Teacher.class, id);
		if(t!=null)
		{
			et.begin();
			em.remove(t);
			et.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

}
