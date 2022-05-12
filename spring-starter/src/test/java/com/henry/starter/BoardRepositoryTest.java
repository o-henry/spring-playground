package com.henry.starter;

import com.henry.starter.domain.Board;
import com.henry.starter.persistence.BoardRepository;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardRepositoryTest {

  @Autowired
  private BoardRepository boardRepo;

  @Test
  public void testInsertBoard() throws Exception {
    Board board = new Board();
    board.setTitle("첫 번째 게시글");
    board.setWriter("테스터");
    board.setContent("잘 작동하나요");
    board.setCreateDate(new Date());
    board.setCnt(0);
    boardRepo.save(board);
  }

}
