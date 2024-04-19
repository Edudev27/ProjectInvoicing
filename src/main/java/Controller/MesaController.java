package Controller;


import Entity.Factura;
import Entity.Mesa;
import IService.IFacturaService;
import IService.IMesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("api/Mesa")

public class MesaController {

    @Autowired
    private IMesaService service;

    @GetMapping("")
    public List<Mesa> All() {
        return service.All();
    }

    @GetMapping("/{id}")
    public Optional<Mesa> FindById(@PathVariable Long id) {
        return service.FindById(id);
    }

    @PostMapping("")
    public Mesa Save(@RequestBody Mesa mesa) {
        return service.Save(mesa);
    }

    @PutMapping("/{id}")
    public void Update(@RequestBody Mesa mesa, @PathVariable Long id) {
        service.Save(mesa);
    }

    @DeleteMapping("/{id}")
    public void Delete(Long id) {
        service.Delete(id);

    }
}
