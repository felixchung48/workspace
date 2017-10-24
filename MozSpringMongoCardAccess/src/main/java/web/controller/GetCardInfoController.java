package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;

import web.card.demon.Demon;

@Controller
public class GetCardInfoController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Demon getDemonInfoInJson(){
		Demon demon = new Demon();
		demon.setCardId("M001");
		demon.setPower(10);
		return demon;
	}

}
