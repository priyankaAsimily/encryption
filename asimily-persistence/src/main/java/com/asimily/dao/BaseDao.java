package com.asimily.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import com.asimily.models.EBase;

@NoRepositoryBean
public interface BaseDao<T extends EBase, ID extends Integer> extends JpaRepository<T, ID>,QuerydslPredicateExecutor<EBase> {
  
  EBase findOneById(Integer id);
}
