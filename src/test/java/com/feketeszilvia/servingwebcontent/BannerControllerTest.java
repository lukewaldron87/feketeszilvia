package com.feketeszilvia.servingwebcontent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(BannerController.class)
class BannerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testShowHome() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
                //.andExpect(forwardedUrl(index.html));

    }

    @Test
    public void testShowBio() throws Exception {
        this.mockMvc.perform(get("/bio"))
                .andExpect(status().isOk())
                .andExpect(view().name("bio"));

    }

    @Test
    public void testShowError() throws Exception {
        this.mockMvc.perform(get("/error"))
                .andExpect(status().isOk())
                .andExpect(view().name("error"));

    }

}