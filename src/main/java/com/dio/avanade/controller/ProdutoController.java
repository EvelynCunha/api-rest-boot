package com.dio.avanade.controller;

import com.dio.avanade.model.Produto;
import com.dio.avanade.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping("/test")
    public String test() {
        return "A API está funcionando! Estou muito feliz com esse projeto da Avanade";
    }
}