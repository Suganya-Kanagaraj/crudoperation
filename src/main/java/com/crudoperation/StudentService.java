package com.crudoperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
@Autowired
StudentDao sd;
public String post (Student s) {
	return sd.post(s);
}
public String list (List<Student> sa) {
	return sd.list(sa);
	
}

public  List<Student>getAll() {
	return sd.getAll();
}

public  Student getId(Integer id) {
	return sd.getId(id);
}


public  String delId(Integer id) {
	return sd.delId(id);
}
public  String upda(Integer a,Student s) {
	return sd.upda(a,s);
}
}
