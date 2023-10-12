package com.Springpro.Springrpo.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="STUDENT")
public class Student {
    @Id
    @Column(name="ID")
    private int id;
    @Column(name="MARK")
    private int mark;
    @Column(name="NAME")
    private String name;

}
