package com.mindtree.service;

import java.util.concurrent.Future;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.mindtree.dao.EntityDao;
import com.mindtree.entity.Stagingtable;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	EntityDao dao;
	@Override
	@Async
	public String asyncMethod() {


		
			try {
				System.out.println(Thread.currentThread().getName());
				Stagingtable entity=new Stagingtable();
				entity.setStagcol1("col1");
				entity.setStagcol2("col2");
				entity.setStagecol3("col3");
				entity.setStagingtablecol4("col4");



				dao.save(entity);



			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return null;
		}
	

	@Override
	public Future<Boolean> asyncFutureMethod() {
		// TODO Auto-generated method stub
		return null;
	}

}
