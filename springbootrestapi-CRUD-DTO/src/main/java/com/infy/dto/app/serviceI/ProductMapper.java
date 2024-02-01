package com.infy.dto.app.serviceI;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.infy.dto.app.Model.Product;
import com.infy.dto.app.dto.Product_DTO;

@Mapper
public interface ProductMapper
{
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	
	public Product_DTO toProductDTO(Product p);
	
	public Product toProduct(Product_DTO pp);

	public List<Product_DTO> toProductDTO_list(List<Product> l);
	
}
