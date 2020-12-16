package com.lish.springcloud.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lish.springcloud.entities.Dept;

/**
 * @author Lish
 *
 */
@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);
	
	public Dept findById(Long id);
	
	public List<Dept> findAll();
}
