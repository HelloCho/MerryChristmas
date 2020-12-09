package org.raspberry.cho.merrychristmas.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MemberVO {

    private int id;
    private String name;
    private int age;
    private String address;
    private String companyCode;
    private Date createdDate;

}
