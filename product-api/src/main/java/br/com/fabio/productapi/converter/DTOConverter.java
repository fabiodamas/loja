package br.com.fabio.productapi.converter;

import br.com.fabio.productapi.dto.CategoryDTO;
import br.com.fabio.productapi.dto.ProductDTO;
import br.com.fabio.productapi.model.Category;
import br.com.fabio.productapi.model.Product;

public class DTOConverter {
	
	public static CategoryDTO convert(Category category) {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(category.getId());
		categoryDTO.setNome(category.getNome());
		return categoryDTO;
	}	
		
	public static ProductDTO convert(Product product) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setNome(product.getNome());
		productDTO.setDescricao(product.getDescricao());
		productDTO.setPreco(product.getPreco());
		
		productDTO.setProductIdentifier(product.getProductIdentifier());
		if (product.getCategory() != null) {
			productDTO.setCategory(DTOConverter.convert(product.getCategory()));
		}
		return productDTO;
	}
	
}