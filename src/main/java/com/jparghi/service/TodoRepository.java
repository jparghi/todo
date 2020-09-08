package com.jparghi.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jparghi.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

	
}
