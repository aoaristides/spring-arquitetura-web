/**
 * 
 */
package br.com.makersweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
*
* @author anderson.aristides
*
*/
@Controller
public class LoginController {
	
	private static String GO_LOGIN = "login";
	private static String GO_RECOVER = "esqueceu-a-senha";
	private static String GO_CREATE = "novo-usuario";

	@RequestMapping(value = "login.html")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView(GO_LOGIN);

		return mav;
	}

	@RequestMapping(value = "esqueceu-a-senha.html")
	public ModelAndView recover() {
		ModelAndView mav = new ModelAndView(GO_RECOVER);

		return mav;
	}

	@RequestMapping(value = "novo-usuario.html")
	public ModelAndView cadastro() {
		ModelAndView mav = new ModelAndView(GO_CREATE);

		return mav;
	}

}
