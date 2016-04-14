package org.packt.Spring.chapter7.springmvc.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.packt.Spring.chapter7.springmvc.controller.EmployeeController;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "classpath*:SpringDispatcher-servlet.xml" })
public class EmployeeControllerTestWithMockMvc {

	@InjectMocks
	private EmployeeController employeeController;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
	}

	@Test
	public void testHome() throws Exception {

		this.mockMvc
				.perform(get("/employee"))
				.andExpect(status().isOk())
				.andExpect(view().name("hello"))
				.andExpect(model().attribute("name", "Hello World!"))
				.andExpect(
						model().attribute("greetings",
								"Welcome to Packt Publishing - Spring MVC !!!"));
	}
}
