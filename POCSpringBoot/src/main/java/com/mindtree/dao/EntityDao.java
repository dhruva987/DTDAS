package com.mindtree.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.entity.Stagingtable;

@Transactional
public interface EntityDao extends CrudRepository<Stagingtable, Long>{

}
