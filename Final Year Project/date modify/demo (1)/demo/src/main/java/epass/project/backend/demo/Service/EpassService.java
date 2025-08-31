package epass.project.backend.demo.Service;

import epass.project.backend.demo.model.Epass;
import epass.project.backend.demo.Repository.EpassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EpassService {

    @Autowired
    private EpassRepository repo;

    public Epass saveEpass(Epass epass) {
        return repo.save(epass);
    }
}
