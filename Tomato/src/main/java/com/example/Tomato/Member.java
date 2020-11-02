package com.example.Tomato;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString

public class Member {
    @Id
    private String m_id;
    
    @Column(unique=true, nullable=false)
    @NonNull
    private String nickname;
    
    @Column(nullable=false)
    @NonNull
    private String passwd;
    
    @Column(nullable=false)
    private String address;
    
    @Column(nullable=false)
    private String phonenum;
    
    @Column(nullable=false)
    private int deal_cnt;
    
    @Column(nullable=false)
    private String grade;

}