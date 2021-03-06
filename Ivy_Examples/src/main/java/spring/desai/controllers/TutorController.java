package spring.desai.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.desai.pojo.Tutor;

@Controller
@RequestMapping("/tutor")
public class TutorController extends BaseController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(tutorValidator);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String tutorAll(Model model) {
		List<Tutor> tutors = (List<Tutor>) tutorDao.getAll();
		model.addAttribute("tutors", tutors);
		model.addAttribute("title", "All Tutors");
		logger.info("tutorAll handler");
		return "tutor-all";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String tutorInsertForm(Model model) {
		logger.info("tutorInsert get request handler");
		return "tutor-insert";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String tutorInsertResult(@ModelAttribute("tutor") Tutor tutor,
			Model model, BindingResult bindingResult) {
		logger.info("tutorInsert post request handler");
		return "result";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String tutorSearchForm(Model model) {
		logger.info("tutorsearch get request handler");
		return "tutor-search";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String tutorSearchResult(@ModelAttribute("tutor") Tutor tutor,
			Model model, BindingResult bindingResult) {
		logger.info("tutorsearch get request handler");
		return "result";
	}

}
