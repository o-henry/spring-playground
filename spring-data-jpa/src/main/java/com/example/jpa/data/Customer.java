package com.example.jpa.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// JPA를 사용하기 위해서 Domain Entity를 정의해야 한다.
// rdbms 와 연결하지 않았으므로 in-memory 에 저장된다
@Entity // This Tells Hibernate to make a table out of this class
public class Customer {

  @Id // annotation을 통해 JPA가 이를 객체의 ID로 인식합니다.
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  // default-value를 추가하고싶다면 builder pattern을 사용해야 한다.
  private String firstName;
  private String lastName;

  private String email;

  // JPA를 위해서 존재하는 생성자
  protected Customer() {
  }

  ;

  // DB에 저장할 Customer 인스턴스를 생성하는 생성자
  public Customer(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%d, firstName='%s', lastName='%s', email='%s']",
        id, firstName, lastName, email);
  }

  public Integer getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }


  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  // setter 는 value object로 정의.
}
