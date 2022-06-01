package com.henry.starter.domain;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@Entity
public class Board {

    //  @Id
//  @GeneratedValue
    private int seq;
    private String title;
    private String writer;
    private String content;
    //  @Temporal(value = TemporalType.TIMESTAMP)
    private Date createDate;
    private int cnt;


}
