package com.prison.data.services;

import com.prison.data.models.Inmate;
import com.prison.data.repository.InmateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InmateService {

    @Autowired
    private InmateRepository inmateRepository;

    public List<Inmate> getAllInmates() {
        return inmateRepository.findAll();
    }

    public Inmate saveInmate(Inmate inmate) {
        return inmateRepository.save(inmate);
    }
}