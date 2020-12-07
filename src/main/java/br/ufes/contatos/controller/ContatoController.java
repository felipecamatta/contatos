package br.ufes.contatos.controller;

import br.ufes.contatos.model.Contato;
import br.ufes.contatos.service.ContatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @GetMapping
    public List<Contato> getAll() {
        return contatoService.getAll();
    }

    @PostMapping
    public Contato save(@RequestBody Contato contato) {
        return contatoService.save(contato);
    }

    @PutMapping("{id}")
    public Contato update(@PathVariable Long id, @RequestBody Contato contato) {
        return contatoService.update(id, contato);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        contatoService.delete(id);
    }

}
