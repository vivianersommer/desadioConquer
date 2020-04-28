package com.conquer.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conquer.desafio.mysql.TurmRepository;
import com.conquer.desafio.mysql.TurmTable;
import com.conquer.desafio.mysql.UserRepository;
import com.conquer.desafio.mysql.UserTable;

@Service
public class MainPageService {
	
	@Autowired
	private TurmRepository turm;
	
	@Autowired
	private UserRepository students;

	public @ResponseBody Iterable<TurmTable> getAllTurms() {
		return turm.findAll();
    }
	
	public @ResponseBody Iterable<UserTable> getAllStudents() {
		return students.findAll();
    }

}
