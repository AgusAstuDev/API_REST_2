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
@Table(name = "localidad")
public class Localidad extends Base {

    @Column(name="denominación")
    private String denominacion;

    @OneToMany(mappedBy = "localidad", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<Domicilio> domicilios = new ArrayList<Domicilio>();

}
