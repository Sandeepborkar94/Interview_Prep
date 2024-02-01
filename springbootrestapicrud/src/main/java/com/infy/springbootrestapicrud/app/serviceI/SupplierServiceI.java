package com.infy.springbootrestapicrud.app.serviceI;

import java.util.List;

import com.infy.springbootrestapicrud.app.model.Supplier;

public interface SupplierServiceI {

	Supplier saveSupplier(Supplier s);

	List<Supplier> getSupplier();

	List<Supplier> getsupplier();

}
