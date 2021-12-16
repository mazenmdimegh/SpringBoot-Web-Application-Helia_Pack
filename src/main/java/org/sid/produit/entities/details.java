package org.sid.produit.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class details implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column
    private long noId;
    @Column
    private long no;
    @Column
    private String nom;
    @Column
    private String heure;
    @Column
    private String etat;
    @Column
    private String nouvelEtat;
    @Column
    private String exception;
    @Column
    private String operation;
}
