package com.deloitte.portal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.deloitte.portal.model.Employee;
import com.deloitte.portal.repository.EmployeeRepository;

@Service
public class PageServiceImpl implements PageService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Page<Employee> findByPagination(int pageNo, int size) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pageNo-1,size);
		return employeeRepository.findAll(pageable);
	}

}
