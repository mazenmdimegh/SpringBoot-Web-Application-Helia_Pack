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

public class Produit implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id ;
    private String name;
    private int quantite;
    private int prix;

}
