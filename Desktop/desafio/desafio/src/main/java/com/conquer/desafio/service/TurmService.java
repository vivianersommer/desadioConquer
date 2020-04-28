package com.conquer.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conquer.desafio.mysql.TurmRepository;
import com.conquer.desafio.mysql.TurmTable;


@Service
public class TurmService {

	@Autowired
	private TurmRepository turm;
	
	
	public @ResponseBody String insertTurm(String name,String teacher, int numberTurm) {
		TurmTable n = new TurmTable();
	    n.setName(name);
	    n.setTeacher(teacher);
	    n.setNumberTurm(numberTurm);
	    turm.save(n);
	    return "Saved";
    }
	
}
