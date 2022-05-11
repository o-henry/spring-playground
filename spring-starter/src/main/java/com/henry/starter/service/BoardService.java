package com.henry.starter.service;

import com.henry.starter.domain.BoardVO;
import java.util.List;

public interface BoardService {

  String hello(String name);

  BoardVO getBoard();

  List<BoardVO> getBoardList();
}
