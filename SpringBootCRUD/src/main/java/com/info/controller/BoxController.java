package com.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.info.model.Box;
import com.info.service.BoxService;

@Controller
@RequestMapping("box")
public class BoxController {

	@Autowired
	private BoxService boxService;

	@GetMapping("box/{boxId}")
	public ResponseEntity<Box> getBoxById(@PathVariable(name = "boxId") Integer boxId) {

		Box boxById = boxService.getBoxById(boxId);

		return new ResponseEntity<Box>(boxById, HttpStatus.OK);

	}

	@GetMapping("boxes")
	public ResponseEntity<List<Box>> getAllBoxes() {

		List<Box> allBoxes = boxService.getAllBoxes();

		return new ResponseEntity<List<Box>>(allBoxes, HttpStatus.OK);
	}

	@PostMapping("box")
	public ResponseEntity<Void> addBox(@RequestBody Box box, UriComponentsBuilder builder) {

		boolean addBox = boxService.addBox(box);

		if (addBox == false) {

			return new ResponseEntity<Void>(HttpStatus.CONFLICT);

		}

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/box/{boxId}").buildAndExpand(box.getBoxId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);

	}

	@PutMapping("box")
	public ResponseEntity<Box> updateBox(@RequestBody Box box) {

		boxService.updateBoxDetails(box);
		return new ResponseEntity<Box>(box, HttpStatus.OK);

	}
@DeleteMapping("box/{boxId}")
	public ResponseEntity<Void> deleteBox(@PathVariable(name = "boxId") Integer boxId) {

		boxService.deleteBox(boxId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

	}

}
