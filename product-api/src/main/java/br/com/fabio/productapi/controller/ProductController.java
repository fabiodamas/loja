package br.com.fabio.productapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabio.productapi.dto.ProductDTO;
import br.com.fabio.productapi.exception.ProductNotFoundException;
import br.com.fabio.productapi.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
		
	@GetMapping("/product")
	public List<ProductDTO> getProducts() {		
		List<ProductDTO> produtos = productService.getAll();		
		return produtos;
	}
	
	@GetMapping("/product/category/{categoryId}")
	public List<ProductDTO> getProductByCategory(@PathVariable Long categoryId) {		
		List<ProductDTO> produtos = productService.getProductByCategoryId(categoryId);		
		return produtos;
	}
		
	@GetMapping("/product/{productIdentifier}")
	ProductDTO findById(@PathVariable String productIdentifier) {
	    return productService.findByProductIdentifier(productIdentifier);
	}
	
	@PostMapping("/product")
	ProductDTO newProduct(@Valid @RequestBody ProductDTO produtoDTO) {		
	    return productService.save(produtoDTO);
	}
		
	@DeleteMapping("/product/{id}")
	ProductDTO delete(@PathVariable Long id) throws ProductNotFoundException {
	    return productService.delete(id);
	}
	
}
