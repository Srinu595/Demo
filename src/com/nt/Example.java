package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

  public class Example {
	private int id;
	private String name;
	private float salary;
	
	public Example(int id,String name,float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
    @Override
	public String toString() {
		return "Example [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

	public static void main(String[] args) {
    	List<Example> emp=new ArrayList<>();
    	emp.add(new Example(10,"srinu",10000.0f));
    	emp.add(new Example(20,"uday",5000.0f));
    	emp.add(new Example(30,"nani",5000.0f));
    	emp.add(new Example(40,"mani",4000.0f));
    	emp.add(new Example(40,"pavani",4000.0f));
    	
  emp.stream().sorted(Comparator.comparing(Example::getSalary)).forEach(s->System.out.println(s.getSalary()));
	}
	}