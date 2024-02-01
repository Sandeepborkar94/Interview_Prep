package com.infy.dto.app.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.infy.dto.app.Model.Product;
import com.infy.dto.app.dto.Product_DTO;
import com.infy.dto.app.serviceI.ProductMapper;

@Component
public class Product_Converter  
{

	public Product_DTO toProductDTO(Product p) {
		Product_DTO dto = new Product_DTO();

		dto.setPname(p.getPname());
		dto.setPdesc(p.getPdesc());

		return dto;
	}


	public Product toProduct(Product_DTO pp) {
		Product p = new Product();

		p.setPname(pp.getPname());
		p.setPdesc(pp.getPdesc());

		return p;
	}


	public List<Product_DTO> toProductDTO_list(List<Product> l) 
	{
		List<Product_DTO> plistdto = new ArrayList<>();

		for (Product p : l) 
		{
			Product_DTO dto = new Product_DTO();
			dto.setPname(p.getPname());
			dto.setPdesc(p.getPdesc());

			plistdto.add(dto);
		}
		return plistdto;
	}

}
