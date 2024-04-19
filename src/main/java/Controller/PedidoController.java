package Controller;

import Entity.Mesa;
import Entity.Pedido;
import IService.IMesaService;
import IService.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("api/Pedido")

public class PedidoController {

    @Autowired
    private IPedidoService service;

    @GetMapping("")
    public List<Pedido> All() {
        return service.All();
    }

    @GetMapping("/{id}")
    public Optional<Pedido> FindById(@PathVariable Long id) {
        return service.FindById(id);
    }

    @PostMapping("")
    public Pedido Save(@RequestBody Pedido pedido) {
        return service.Save(pedido);
    }

    @PutMapping("/{id}")
    public void Update(@RequestBody Pedido pedido, @PathVariable Long id) {
        service.Save(pedido);
    }

    @DeleteMapping("/{id}")
    public void Delete(Long id) {
        service.Delete(id);

    }
}
