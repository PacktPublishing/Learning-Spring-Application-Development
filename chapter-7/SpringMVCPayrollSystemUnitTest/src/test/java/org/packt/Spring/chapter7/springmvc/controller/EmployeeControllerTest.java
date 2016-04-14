package org.packt.Spring.chapter7.springmvc.controller;

import org.junit.Assert;
import org.junit.Test;
import org.packt.Spring.chapter7.springmvc.controller.EmployeeController;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.ModelMap;

public class EmployeeControllerTest {

	@Test
	public void testWelcomeEmployee() {

		EmployeeController controller = new EmployeeController();

		ModelMap modelMap = new ExtendedModelMap();

		String view = controller.welcomeEmployee(modelMap);

		// verify view page name
		Assert.assertNotNull(view);
		Assert.assertEquals("hello", view);

		// verify page title
		String titlename = modelMap.get("name").toString();
		Assert.assertEquals("Hello World!", titlename);

		// verify message
		String greetings = modelMap.get("greetings").toString();
		Assert.assertEquals("Welcome to Packt Publishing - Spring MVC !!!",
				greetings);
	}

}
