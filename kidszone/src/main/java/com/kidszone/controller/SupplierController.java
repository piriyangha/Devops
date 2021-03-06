package com.kidszone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kidszonebackend.Dao.SupplierDao;

import com.kidszonebackend.Model.Supplier;

@Controller
public class SupplierController {
	@Autowired
	SupplierDao supplierDao;

	/*
	 * @RequestMapping(value= {"/supplier"}) public String addSupplier(Model model)
	 * { model.addAttribute("supp",new Supplier()); return "supplier"; }
	 */
	@RequestMapping(value = { "/savesupplier" })
	public String saveSupplierDetails(@ModelAttribute("supp") Supplier supplier) {
		supplierDao.insertSupplier(supplier);
		return "redirect:/supplierlist";

	}

	@RequestMapping(value = "/supplierlist")
	public String showAllSupplier(Model model) {
		List<Supplier> supplier = supplierDao.getAllSuppliers();
		model.addAttribute("supplier", supplier);
		return "supplierlist";
	}

	@RequestMapping(value = "/all/deletesupplier/{sid}")
	public String deleteSupplier(@PathVariable int sid) {
		supplierDao.deleteSupplier(sid);
		return "redirect:/supplierlist";
	}

	@RequestMapping(value = { "/all/supplier/editform/{sid}" })
	public String editForm(@PathVariable int sid, Model model) {
		Supplier supplier = supplierDao.getSupplierById(sid);
        model.addAttribute("supp", supplier);
		return "updatesupplier";
	}

	@RequestMapping(value = { "/all/supplier/updatesupplier" })
	public String updateSupplier(@ModelAttribute("supplier") Supplier supplier) {
        //model.addAttribute("supplier", supplier);
		supplierDao.updateSupplier(supplier);
		return "redirect:/supplierlist";
	}

}
