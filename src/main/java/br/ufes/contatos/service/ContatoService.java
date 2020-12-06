package br.ufes.contatos.service;

import br.ufes.contatos.model.Contato;
import br.ufes.contatos.repository.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    private final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public List<Contato> getAll() {
        return this.contatoRepository.findAll();
    }

    public Contato save(Contato contato) {
        contato = this.contatoRepository.save(contato);
        return contato;
    }

}
