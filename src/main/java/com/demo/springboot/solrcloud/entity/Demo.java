package com.demo.springboot.solrcloud.entity;

import lombok.*;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.persistence.Id;

@Data
@SolrDocument
public class Demo {

    @Id
    @Field
    private String id;

    @Field
    private String name;

}
