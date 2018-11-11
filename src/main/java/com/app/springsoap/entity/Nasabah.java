package com.app.springsoap.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "nasabah")
public class Nasabah implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nasabahId;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    public Nasabah(){}

    public Nasabah(String name, String category){
        this.name = name;
        this.category = category;
    }

    public Long getNasabahId(){
        return nasabahId;
    }

    public void setNasabahId(Long nasabahId){
        this.nasabahId = nasabahId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
