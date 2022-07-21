package co.grandcircus.hotelLab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	
	@Autowired
	private HotelsRepository repo;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Hotels> hotels = repo.findAll();
		int size = hotels.size();
		model.addAttribute("hotels", hotels);
		model.addAttribute("size", size);
		return "homepage";
	}
	
	@RequestMapping("/results")
	public String results(@RequestParam String city, Model model) {
		List<Hotels> hotels = repo.findByCity(city);
		model.addAttribute("hotels", hotels);
		model.addAttribute("city", city);
		return "results";
		
	}
}
