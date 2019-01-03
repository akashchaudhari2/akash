package com.info.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "box")
public class Box {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "boxId")
	private int boxId;

	@Column(name = "boxName")
	private String boxName;

	@Column(name = "boxInfo")
	private String boxInfo;

	@Column(name = "sourceStation")
	private String sourceStation;

	@Column(name = "destinationSource")
	private String destinationSource;

	public int getBoxId() {
		return boxId;
	}

	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}

	public String getBoxName() {
		return boxName;
	}

	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}

	public String getBoxInfo() {
		return boxInfo;
	}

	public void setBoxInfo(String boxInfo) {
		this.boxInfo = boxInfo;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationSource() {
		return destinationSource;
	}

	public void setDestinationSource(String destinationSource) {
		this.destinationSource = destinationSource;
	}

}
