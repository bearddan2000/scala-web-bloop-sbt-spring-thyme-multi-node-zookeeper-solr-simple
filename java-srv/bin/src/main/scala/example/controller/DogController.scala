package example.controller;

import java.util.Arrays;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class DogController {

	val title = "Dog Table";
	val dataTable = "dogTable";
	val columnNames = Arrays.asList("Id", "Breed", "Color");

	@GetMapping(Array("/"))
	def goHome(model: Model): String =
	{
		model.addAttribute("title", title);
		model.addAttribute("dataTable", dataTable);
		model.addAttribute("columnNames", columnNames);

		return "index";
	}
}
