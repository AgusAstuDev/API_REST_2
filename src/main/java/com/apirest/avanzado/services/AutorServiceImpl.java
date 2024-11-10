package com.apirest.avanzado.services;

import com.apirest.avanzado.entities.Autor;
import com.apirest.avanzado.repositories.AutorRepository;
import com.apirest.avanzado.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
