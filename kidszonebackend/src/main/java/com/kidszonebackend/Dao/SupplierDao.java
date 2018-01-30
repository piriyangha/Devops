package com.kidszonebackend.Dao;

import java.util.List;

import com.kidszonebackend.Model.Supplier;

public interface SupplierDao {
 public boolean insertSupplier(Supplier supplier);
 public List<Supplier> getAllSuppliers();
 //public String deleteSupplier(int sid);//for project
 public boolean deleteSupplier(Supplier supplier);//for test case
 //public Supplier getSupplierById(int sid);
 public boolean updateSupplier(Supplier supplier);
 
 

}
