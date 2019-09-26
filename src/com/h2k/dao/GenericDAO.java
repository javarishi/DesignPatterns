package com.h2k.dao;

import java.util.List;

public interface GenericDAO {

	List<Object> selectAll();
	int addEntity(Object obj);
	void updateEntity(Object obj);
	void deleteEntity(Object obj);
}
