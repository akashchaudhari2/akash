package com.info.service;

import java.util.List;

import com.info.model.Box;

public interface BoxServiceImpl {

	List<Box> getAllBoxes();

	boolean addBox(Box box);

	Box getBoxById(int box);

	void updateBoxDetails(Box box);

	void deleteBox(int box);

}
