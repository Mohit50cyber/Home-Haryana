package com.hrms.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.model.Module;
import com.hrms.model.Program;

@Repository
public class ProgramDaoImpl implements ProgramDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Program> getPrograms() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Program.class);
		List<Program> programs = (List<Program>) criteria.setFetchMode("M_PROGRAM", FetchMode.SELECT).list();
		return programs;
	}

	@Override
	public void addProgram(Program program) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(program);
		tx.commit();
	}

}
