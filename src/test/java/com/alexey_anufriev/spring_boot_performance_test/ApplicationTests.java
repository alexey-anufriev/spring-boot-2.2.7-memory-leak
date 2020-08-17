package com.alexey_anufriev.spring_boot_performance_test;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnHelloMessage() throws Exception {
        String id = UUID.randomUUID().toString();
        this.mockMvc.perform(get("/api/" + id))
                .andExpect(status().isOk())
                .andExpect(content().string(Matchers.containsString("Hello " + id)));
    }

}
