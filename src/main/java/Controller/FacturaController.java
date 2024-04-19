package Controller;

import Entity.Factura;
import IService.IFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("api/Factura")

public class FacturaController {

    @Autowired
    private IFacturaService service;

    @GetMapping("")
    public List<Factura> All() {
        return service.All();
    }

    @GetMapping("/{id}")
    public Optional<Factura> FindById(@PathVariable Long id) {
        return service.FindById(id);
    }

    @PostMapping("")
    public Factura Save(@RequestBody Factura factura) {
        return service.Save(factura);
    }

    @PutMapping("/{id}")
    public void Update(@RequestBody Factura factura, @PathVariable Long id) {
        service.Save(factura);
    }

    @DeleteMapping("/{id}")
    public void Delete(Long id) {
        service.Delete(id);

    }

}
