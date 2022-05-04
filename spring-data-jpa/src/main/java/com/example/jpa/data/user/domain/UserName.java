package com.example.jpa.data.user.domain;

import java.util.Objects;


// record 는 immutable한 객체를 쉽게 생성하는 클래스 JDK 16에서 정식 포함 암묵적으로 final 클래스 이며 abstract 선언이 불가하다.
// 다른 클래스를 상속받을수 없으며 인터페이스 구현은 가능하다.
public record UserName(String value) {

  public UserName {
    Objects.requireNonNull(value);
    if (value.length() < 3) {
      throw new IllegalArgumentException("user name must be at least 3 characters long.");
    }
  }
}

