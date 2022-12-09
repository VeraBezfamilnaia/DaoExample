package com.bezf.daoexample.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import util.FileReader;

import java.util.Map;

@Repository
public class ProductRepository {
    private static final String SCRIPT_FILE_NAME = "selectScript.sql";
    private final NamedParameterJdbcTemplate template;

    @Autowired
    public ProductRepository(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public String getProductName(String name) {
        var queryForSelect = FileReader.read(SCRIPT_FILE_NAME);
        return template.queryForObject(queryForSelect, Map.of("name", name), String.class);
    }
}
