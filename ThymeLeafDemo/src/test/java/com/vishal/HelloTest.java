package com.vishal;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/appContext.xml")
@WebAppConfiguration
public class HelloTest {
	@Autowired
	WebApplicationContext ctx;

	MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = webAppContextSetup(ctx).build();
	}

	@Test
	public void testName() throws Exception {
		assertNotNull(mvc);
		mvc.perform(get("/message")).andExpect(status().isOk())
				.andExpect(content().string(containsString("10/Mar/2015")));
	}
}
