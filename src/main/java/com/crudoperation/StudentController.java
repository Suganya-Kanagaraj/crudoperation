package com.crudoperation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/Student")
public class StudentController {
@Autowired
StudentService ss;

@PostMapping(value="/postStudent")
public String post (@RequestBody Student s) {
	return ss.post(s);
}

@PostMapping(value="/list")
public String list (@RequestBody List<Student> sa) {
	return ss.list(sa);
}

@GetMapping(value="/getAll")
public  List<Student>getAll() {
	return ss.getAll();
}

@GetMapping(value="/getid/{id}")
public  Student getId(@PathVariable Integer id) {
	return ss.getId(id);
}
@DeleteMapping(value="/getid1/{id}")
public  String delId(@PathVariable Integer id) {
	return ss.delId(id);
}

@PutMapping(value="/update/{a}")
public  String upda(@PathVariable Integer a, @RequestBody Student s) {
	return ss.upda(a,s);
}

}