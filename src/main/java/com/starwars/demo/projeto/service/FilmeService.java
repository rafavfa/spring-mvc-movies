package com.starwars.demo.projeto.service;

import com.starwars.demo.projeto.model.Filme;
import com.starwars.demo.projeto.repository.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public Filme cadastrarFilme(Filme filme) {
        return filmeRepository.save(filme);
    }

    public void deletarFilmePorId(int id) {
        filmeRepository.deleteById(id);
    }

    public Optional<Filme> buscarFilmePorId(int id) {
        return filmeRepository.findById(id);
    }

    public List<Filme> listarTodosFilmes() {
        return (List<Filme>) filmeRepository.findAll();
    }

}