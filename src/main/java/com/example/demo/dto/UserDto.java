package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3455708072851380697L;
	private Long id;
	private String name;
	private String password;

}
