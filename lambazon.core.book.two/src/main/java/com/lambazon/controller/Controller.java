package com.lambazon.controller;

import java.util.Collection;

import com.lambazon.domain.Criteria;


public interface Controller<T> {
	
	public T get(int id);
	public Collection<T> getAll(Class<T> t);
	public Collection<T> getFiltered(Class<T> t, Criteria criteria);
	public T save(T t);
	public T remove(T t);
	
}
