package com.lish.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lish.springcloud.dao.DeptDao;
import com.lish.springcloud.entities.Dept;
import com.lish.springcloud.service.DeptService;

/**
 * @author Lish
 *
 */
@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean addDept(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}
