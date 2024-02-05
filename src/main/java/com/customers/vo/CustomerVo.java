package com.customers.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerVo {

	private long id;
	private String name;
	private String phone_number;
	private String email;	
	private String gender;
	private String address;
}
