package com.crudoperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class StudentDao {
@Autowired
StudentRepository sr;
public String post(Student s) {
	sr.save(s);
	return "posted";
}
	
public String list(List<Student> sa ) {
	sr.saveAll(sa);
	return "success";
}
public  List<Student>getAll() {
	return sr.findAll();
}
public  Student getId(Integer id) {
	return sr.findById(id).get();
}
public  String delId(Integer id) {
	sr.deleteById(id);
	return "Deleted";
}
public  String upda(Integer a,Student s) {
	sr.save(s);
	return "Updated";
}
}
