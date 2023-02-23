package com.deloitte.portal.service;

import org.springframework.data.domain.Page;

import com.deloitte.portal.model.Employee;


public interface PageService {
	 Page<Employee> findByPagination(int pageNo, int size);

}
