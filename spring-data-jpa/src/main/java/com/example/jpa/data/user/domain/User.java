package com.example.jpa.data.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// JPA를 사용하기 위해서 Domain Entity를 정의해야 한다.
// *(Table이나 column이 없는 상태) → rdbms 와 연결하지 않았으므로 in-memory 에 저장된다
@Entity // This Tells Hibernate to make a table out of this class
@Table(name = "customer")
public class User {

  @Id // annotation을 통해 JPA가 이를 객체의 ID로 인식합니다.
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;


  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "email", nullable = false)
  private String email;

  // JPA를 위해서 존재하는 생성자
  public User() {
  }


  // DB에 저장할 User 인스턴스를 생성하는 생성자
  // default-value를 추가하고싶다면 builder pattern을 사용해야 한다.
  public User(String name, String email) {
    this.name = name;
    this.email = email;

  }

  @Override
  public String toString() {
    return String.format(
        "User[id=%d, name='%s', email='%s']",
        id, name, email);
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }


  public String getEmail() {
    return email;
  }

  // setter 는 value object로 정의.
}

