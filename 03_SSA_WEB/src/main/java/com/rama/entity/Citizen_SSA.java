package com.rama.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table
public class Citizen_SSA {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Cid;
	private Integer SSN;
	private String State;

}
