package com.apirest.avanzado.repositories;

import com.apirest.avanzado.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
