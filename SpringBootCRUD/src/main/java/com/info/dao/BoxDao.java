package com.info.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.info.model.Box;

@Repository
public interface BoxDao extends CrudRepository<Box, Integer> {

	List<Box> findByBoxId(int box);

	List<Box> findByBoxIdAndBoxName(int boxId, String boxName);

}
