package com.kidszonebackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kidszonebackend.Dao.SupplierDao;
import com.kidszonebackend.Model.Supplier;

@Repository("supplierDao")
@Transactional
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void insertSupplier(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public List<Supplier> getAllSuppliers() {

		return sessionFactory.getCurrentSession().createQuery("from Supplier", Supplier.class).list();
	}

	@Override
	public void deleteSupplier(int supplierid) {
		sessionFactory.getCurrentSession().delete(getSupplierById(supplierid));
	}

	public Supplier getSupplierById(int sid) {
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, sid);

	}

    @Override
	public void updateSupplier(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	/*
	 * public boolean deleteSupplier(Supplier supplier) { try {
	 * sessionFactory.getCurrentSession().delete(supplier); return true; } catch
	 * (Exception e) { e.printStackTrace(); return false; } }
	 */
}
