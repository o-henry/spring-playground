package com.henry.starter;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.henry.starter.service.BoardService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class BoardControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private BoardService boardService;


  @Test
  public void testHello() throws Exception {
    when(boardService.hello("둘리")).thenReturn("Hello : 둘리");

    mockMvc.perform(get("/hello").param("name", "둘리")).andExpect(status().isOk())
        .andExpect(content().string("Hello : 둘리")).andDo(print());
  }
}