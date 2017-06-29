package org.rf.springbootsampledatasolr;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;

public interface ProductRepository extends SolrCrudRepository<Product, String> {

	List<Product> findByNameStartingWith(String name);

}