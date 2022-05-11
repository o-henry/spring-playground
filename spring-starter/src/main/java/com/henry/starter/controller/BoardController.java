package com.henry.starter.controller;

import com.henry.starter.domain.BoardVO;
import com.henry.starter.service.BoardService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

  @Autowired
  private BoardService boardService;

  public BoardController() {
    System.out.println("===> BoardController 생성");
  }

  @GetMapping("/hello")
  public String hello(String name) {
    return boardService.hello(name);
  }

  @GetMapping("/getBoard")
  public BoardVO getBoard() {
    return boardService.getBoard();
  }

  @GetMapping("/getBoardList")
  public List<BoardVO> getBoardList() {
    return boardService.getBoardList();
  }
}
