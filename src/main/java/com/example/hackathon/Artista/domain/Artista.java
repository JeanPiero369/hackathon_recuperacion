package com.example.hackathon.Artista.domain;


import com.example.hackathon.Cancion.domain.Cancion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String nombre;

    @OneToMany(mappedBy = "artista",cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Cancion> canciones = new ArrayList<>();

}
