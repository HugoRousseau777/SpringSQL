package com.Springpro.Springrpo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="POKEMONS")
public class Pokemon {
    @Id
    @Column(name="ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name="LEVEL")
    private int level;
}
