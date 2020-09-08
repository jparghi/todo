/**
 * 
 */
package com.jparghi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.jparghi.service.TodoRepository;

/**
 * @author jigishkp
 *
 */
@RestController
public class TodoController {
	
	@Autowired
	public TodoRepository repository;

	

	
	
}
