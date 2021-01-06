package com.untels.estadonutricional.service;

import com.untels.estadonutricional.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public boolean existePorCodigoUniversitario(String codigo) {
        return alumnoRepository.existsByCodigoUniversitario(codigo);
    }

}
