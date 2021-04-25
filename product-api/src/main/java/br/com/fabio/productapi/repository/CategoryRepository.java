package br.com.fabio.productapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fabio.productapi.model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
		
}