package com.prison.data.controllers;

import com.prison.data.models.Inmate;
import com.prison.data.services.InmateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inmates")
@CrossOrigin(origins = "*")
public class InmateController {

    @Autowired
    private InmateService inmateService;

    @GetMapping
    public List<Inmate> getAllInmates() {
        return inmateService.getAllInmates();
    }

    @PostMapping
    public Inmate createInmate(@RequestBody Inmate inmate) {
        return inmateService.saveInmate(inmate);
    }
}