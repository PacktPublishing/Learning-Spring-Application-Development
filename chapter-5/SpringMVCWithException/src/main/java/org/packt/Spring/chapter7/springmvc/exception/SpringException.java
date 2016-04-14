package org.packt.Spring.chapter7.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class SpringException {

	@ExceptionHandler(Exception.class)
	public ModelAndView allException(Exception e) {

		ModelAndView modelAndView = new ModelAndView("error/exception");
		modelAndView.addObject("error", e.getClass().getSimpleName());
		modelAndView.addObject("message", e.getMessage());

		return modelAndView;
	}

	@ExceptionHandler(GenericException.class)
	public ModelAndView genericException(GenericException ex) {

		ModelAndView modelAndView = new ModelAndView("error/exception");
		modelAndView.addObject("error", ex.getClass().getSimpleName());
		modelAndView.addObject("message",
				ex.getExceptionCode() + " - " + ex.getExceptionMsg());

		return modelAndView;
	}
}
