package springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/silly")
public class SillyController {

	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processFormVersionThree")
	public String outputTheData(@RequestParam("studentName") String theName, Model model) {
		theName = theName.toUpperCase();

		String result = "Hey My Friend from v3! " + theName;

		model.addAttribute("message", result);

		return "helloworld";

	}

}
