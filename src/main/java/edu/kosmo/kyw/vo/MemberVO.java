package edu.kosmo.kyw.vo;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
-------- -------- ------------- 
ID       NOT NULL NUMBER        
USERNAME NOT NULL VARCHAR2(100) 
NAME     NOT NULL VARCHAR2(100) 
GENDER            VARCHAR2(1)   
BIRTH             DATE          
EMAIL             VARCHAR2(50)  
PHONE             VARCHAR2(20)  
PASSWORD NOT NULL VARCHAR2(20)    
*/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberVO {

	private int id;
	private String username;
	private String name;
	private String gender;
	private Timestamp birth;
	private String email;
	private String phone;
	private String password;
	
	private String birth2;

}
