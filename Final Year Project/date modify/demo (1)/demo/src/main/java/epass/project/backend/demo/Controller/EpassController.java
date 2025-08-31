package epass.project.backend.demo.controller;

import epass.project.backend.demo.model.Epass;
import epass.project.backend.demo.Service.EpassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/epass")
@CrossOrigin(origins = "*") // Allow frontend (HTML/JS) to call backend
public class EpassController {

    @Autowired
    private EpassService service;

    @PostMapping("/create")
    public Epass createEpass(@RequestBody Epass epass) {
        return service.saveEpass(epass);
    }
}
