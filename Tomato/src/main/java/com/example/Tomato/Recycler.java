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

public class Recycler {
    @Id
    private String r_id;
    
    @Column(nullable=false)
    @NonNull
    private String c_name;
    
    @Column(nullable=false)
    @NonNull
    private String r_name;
    
    @Column(nullable=false)
    private String m_id;
    
    @Column(nullable=false)
    private int price;
    

}