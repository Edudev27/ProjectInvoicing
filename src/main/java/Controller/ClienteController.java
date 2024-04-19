package Controller;


import Entity.Cliente;
import IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("api/Cliente")

public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping("")
    public List<Cliente> All() {
        return service.All();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> FindById(@PathVariable Long id) {
        return service.FindById(id);
    }

    @PostMapping("")
    public Cliente Save(@RequestBody Cliente cliente) {
        return service.Save(cliente);
    }

    @PutMapping("/{id}")
    public void Update(@RequestBody Cliente cliente, @PathVariable Long id) {
        service.Save(cliente);
    }

    @DeleteMapping("/{id}")
    public void Delete(Long id) {
        service.Delete(id);

    }


}
