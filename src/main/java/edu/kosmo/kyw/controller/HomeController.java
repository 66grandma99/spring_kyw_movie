package edu.kosmo.kyw.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.kosmo.kyw.service.MovieService;
import edu.kosmo.kyw.vo.MovieVO;
import lombok.extern.log4j.Log4j;


@Log4j
@Controller
public class HomeController {
	

	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	
		//Main 화면용 image 6개
		List<MovieVO> movies = new ArrayList<MovieVO>();
		
		for(int i=1 ;i <=6 ; i++) {
			movies.add(movieService.getMovie(i));
		}
		
		model.addAttribute("movies", movies );
		
		log.info( "무비 6개 =================== "  + movies);
		
		
		return "movie_index";
	}
	
}
