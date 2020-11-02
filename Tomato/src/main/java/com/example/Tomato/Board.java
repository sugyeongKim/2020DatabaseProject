package com.example.Tomato;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

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

public class Board {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer b_id;
    
    @Column(nullable=false)
    @NonNull
    private String c_name;
    
    @Column(unique=true, nullable=false)
    @NonNull
    private String title;
    
    @Column(nullable=false)
    @NonNull
    private String writer;
    
    @Lob
    @NonNull
    private String Contents;
    
    @Column(nullable=false)
    private int w_date;
    
    @Column(nullable=false)
    private String m_date;

}