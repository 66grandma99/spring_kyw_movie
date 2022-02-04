package edu.kosmo.kyw.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
이름           널?       유형             
------------ -------- -------------- 
ID           NOT NULL NUMBER         
TITLE        NOT NULL VARCHAR2(100)  
VIEW_AGE              NUMBER         
DESCRIPTION           VARCHAR2(2000) 
DIRECTOR              VARCHAR2(100)  
GRADE                 NUMBER         
RUNNING_TIME          NUMBER         
GENRE                 VARCHAR2(20)   
*/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MovieVO {

	private int id;
	private String title;
	private int view_age;
	private String description;
	private String director;
	private int grade;
	private int running_time;
	private String genre;
	
	List<ImageVO> imageList;

}
