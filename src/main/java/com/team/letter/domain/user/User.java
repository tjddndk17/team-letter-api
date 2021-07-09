package com.team.letter.domain.user;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private String joinType;
    private String nickname;
    private String gender;
    private String state;
    private Date createDt;
    private Date updateDt;

    @Builder
    public User(String email, String password, String joinType, String nickname, String gender, String state){
        this.email = email;
        this.password = password;
        this.joinType = joinType;
        this.nickname = nickname;
        this.gender = gender;
        this.state = state;
    }

}
