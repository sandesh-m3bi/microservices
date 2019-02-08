package com.user.userservice.controller;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
	
	private MockMvc mvc;
	
	@Autowired
    private WebApplicationContext context;

	@Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(springSecurity())
                .build();
    }
	
	@Test
    public void shouldGetUnauthorizedWithoutRole() throws Exception {
        mvc.perform(get("/users")).andExpect(status().isUnauthorized());
    }
	
	/*@Test
    @WithMockUser(roles = "ADMIN")
    public void getUsersSuccessfullyWithUserRole() throws Exception {
        mvc.perform(get("/users").header("Authorization", "Bearer nsodunsodiuv"))
                .andExpect(status().is2xxSuccessful());
    }*/
}
