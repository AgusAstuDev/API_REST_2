package com.apirest.avanzado.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
@Table(name = "autor")
public class Autor extends Base {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "biografia")
    private String biografia;

    @ManyToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable (
            name = "autor_Libro",
            joinColumns = @JoinColumn(name = "autorId"),
            inverseJoinColumns = @JoinColumn (name = "libroID")
    )
    @Builder.Default
    private List<Libro> libros = new ArrayList<>();
}
