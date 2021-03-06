package com.henry.starter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class StarterApplicationTests {

  @Autowired // 어노테이션 보다 생성자 주입을 사용하자.
  Environment environment;

  @Test
  public void contextLoads() {
    System.out.println("이름 : " + environment.getProperty("author.name"));
    System.out.println("나이 : " + environment.getProperty("author.age"));
    System.out.println("국가 :" + environment.getProperty("author.nation"));
  }

}
