package com.springweb.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {

  @Autowired
  DataSource excaliburDS;

  @Autowired
  private DataSourceTransactionManager trnxMgr;
  
  public void execQuery(){
    
    String result;
    JdbcTemplate jdbcTemplate = null;
    try {

      jdbcTemplate = new JdbcTemplate(this.excaliburDS);
      result = jdbcTemplate.queryForObject("SELECT 'HI FROM DB'", String.class);
      System.out.println("Result: "+result);

    } catch (DataAccessException exception) {
      exception.printStackTrace();

    }
  }
  
}
