package com.info.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.dao.BoxDao;
import com.info.model.Box;

@Service
public class BoxService implements BoxServiceImpl {

	@Autowired
	private BoxDao boxdao;

	@Override
	public List<Box> getAllBoxes() {
		// TODO Auto-generated method stub

		List<Box> boxs = new ArrayList<Box>();
		boxdao.findAll().forEach(e -> boxs.add(e));
		return boxs;
	}

	@Override
	public synchronized boolean addBox(Box box) {
		// TODO Auto-generated method stub

		List<Box> findByBoxIdAndBoxName = boxdao.findByBoxIdAndBoxName(box.getBoxId(), box.getBoxName());

		if (findByBoxIdAndBoxName.size() > 0) {

			return false;

		} else {

			boxdao.save(box);
			return true;

		}

	}

	@Override
	public Box getBoxById(int box) {
		// TODO Auto-generated method stub

		Box box2 = boxdao.findById(box).get();

		return box2;
	}

	@Override
	public void updateBoxDetails(Box box) {
		// TODO Auto-generated method stub

		boxdao.save(box);

	}

	@Override
	public void deleteBox(int box) {
		// TODO Auto-generated method stub

		boxdao.delete(getBoxById(box));
	}

}
