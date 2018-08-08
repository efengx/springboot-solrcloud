package com.demo.springboot.solrcloud.repository;

import com.demo.springboot.solrcloud.entity.Demo;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.data.solr.repository.Facet;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface DemoRepo extends SolrCrudRepository<Demo, Long> {

    List<Demo> findByName(String name);

    @Query(value = "name:?0")
    @Facet(fields = {"name"}, limit = 20)
    FacetPage<Demo> findByNameAndPage(String name, Pageable page);

}
