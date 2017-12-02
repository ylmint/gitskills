package com.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Addresstable entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.dao.Addresstable
 * @author MyEclipse Persistence Tools
 */

public class AddresstableDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AddresstableDAO.class);
	// property constants
	public static final String FIRSTNAME = "firstname";
	public static final String PHONE = "phone";
	public static final String EMAIL = "email";

	public void save(Addresstable transientInstance) {
		log.debug("saving Addresstable instance");
		Transaction tran = null;
		try {
			tran = getSession().beginTransaction();
			getSession().save(transientInstance);
			tran.commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			tran.rollback();
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Addresstable persistentInstance) {
		log.debug("deleting Addresstable instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Addresstable findById(java.lang.Integer id) {
		log.debug("getting Addresstable instance with id: " + id);
		try {
			Addresstable instance = (Addresstable) getSession().get(
					"com.dao.Addresstable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Addresstable instance) {
		log.debug("finding Addresstable instance by example");
		try {
			List results = getSession().createCriteria("com.dao.Addresstable")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Addresstable instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Addresstable as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFirstname(Object firstname) {
		return findByProperty(FIRSTNAME, firstname);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findAll() {
		log.debug("finding all Addresstable instances");
		try {
			String queryString = "from Addresstable";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Addresstable merge(Addresstable detachedInstance) {
		log.debug("merging Addresstable instance");
		try {
			Addresstable result = (Addresstable) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Addresstable instance) {
		log.debug("attaching dirty Addresstable instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Addresstable instance) {
		log.debug("attaching clean Addresstable instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}