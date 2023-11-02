package com.hyperion.spring_boot_demo.domain;

import java.sql.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "car")
public class car {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    @Column
    private String nom;
    @Basic
    @Column
    private String categorie;
    @Column
    private int prix; 
    @Basic
    @Column
    private String type; 
    @Column
    private Date anneeFabrication;

    public car(String nom, String categorie, int prix, String type, Date annee_fabrication) {
        this.nom = nom;
        this.categorie = categorie;
        this.prix = prix;
        this.type = type;
        this.anneeFabrication = annee_fabrication;
    } 
}


