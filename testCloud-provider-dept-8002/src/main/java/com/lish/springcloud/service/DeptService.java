package com.lish.springcloud.service;

import java.util.List;

import com.lish.springcloud.entities.Dept;

/**
 * @author Lish
 *
 */
public interface DeptService {

	public boolean addDept(Dept dept);
	
	public Dept get(Long id);
	
	public List<Dept> list();
}
