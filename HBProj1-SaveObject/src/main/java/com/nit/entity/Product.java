package com.nit.entity;

import java.io.Serializable;

import lombok.Data;
@Data
public class Product implements Serializable {
	private Integer pid;
	private String pname;
	private Float qty;
	private float price;
	

}
