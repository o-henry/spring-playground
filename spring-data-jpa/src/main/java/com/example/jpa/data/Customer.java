package com.example.jpa.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// JPA를 사용하기 위해서 Domain Entity를 정의해야 한다.
@Entity
public class Customer {

  @Id // annotation을 통해 JPA가 이를 객체의 ID로 인식합니다.
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;

  // JPA를 위해서 존재하는 생성자
  protected Customer() {
  }

  ;

  // DB에 저장할 Customer 인스턴스를 생성하는 생성자
  public Customer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%d, firstName='%s', lastName='%s']",
        id, firstName, lastName
    );
  }

  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }


  public String getLastName() {
    return lastName;
  }
}

