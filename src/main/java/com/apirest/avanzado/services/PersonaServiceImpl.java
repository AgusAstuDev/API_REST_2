package com.apirest.avanzado.services;

import com.apirest.avanzado.entities.Persona;
import com.apirest.avanzado.repositories.BaseRepository;
import com.apirest.avanzado.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);

    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {

            //Query JPA
//            List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);

            //Query con JPQL
            List<Persona> personas = personaRepository.search(filtro);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {

            //Query JPA
//            Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);

            //Query con JPQL
            Page<Persona> personas = personaRepository.search(filtro, pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
