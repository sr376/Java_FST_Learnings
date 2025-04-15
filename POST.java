Body / form.data

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.telusko.springmvcboot.model.Alien;
import com.telusko.springmvcboot.repo.AlienRepo;

@RestController // Shortcut for @Controller + @ResponseBody on every method
public class AlienController {

    @Autowired
    AlienRepo repo;

    // Get all aliens
    @GetMapping("aliens")
    public List<Alien> getAliens() {
        List<Alien> aliens = repo.findAll();
        return aliens;
    }

    // Get alien by ID
    @GetMapping("alien/{aid}")
    public Alien getAlien(@PathVariable("aid") int aid) {
        Alien alien = repo.findById(aid).orElse(new Alien(0, "Unknown"));
        return alien;
    }

    // Add a new alien
    @PostMapping("alien")
    public Alien addAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
}
