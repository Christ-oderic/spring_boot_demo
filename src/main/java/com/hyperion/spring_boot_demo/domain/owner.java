package com.hyperion.spring_boot_demo.domain;

import java.util.Set;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="owner")
public class owner {
    @Id
    @GeneratedValue
    private Long id;
    @Basic
    @Column
    private String name;
    @OneToMany(mappedBy = "owner")
    private Set<owner> myCar;
}
