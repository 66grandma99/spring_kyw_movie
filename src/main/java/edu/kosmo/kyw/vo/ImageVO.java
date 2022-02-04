package edu.kosmo.kyw.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
이름       널?       유형            
-------- -------- ------------- 
ID       NOT NULL NUMBER        
PATH              VARCHAR2(200) 
MOVIE_ID          NUMBER        
NAME              VARCHAR2(20)  
*/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ImageVO {

	private int id;
	private String path;
	private int movie_id;
	private String name;
	
}
