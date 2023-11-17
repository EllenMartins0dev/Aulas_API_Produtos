package com.senai.produtos;
// o * significa pra importar tudo.
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {
    private ProdutoRepository pr;

    public ProdutoController(ProdutoRepository pr) {
        this.pr = pr;
    }

    @GetMapping
    public List<Produto> getAll(){
        // SELECTED * FROM produtos;
        return this.pr.findAll();
    }

    @GetMapping("searchName")
    public List<Produto> getAllByName(@RequestParam("nome") String nome) {
        return this.pr.findByNomeContainingIgnoreCase(nome);
    }

    @GetMapping("searchDescription")
    public List<Produto> getAllByDescription(@RequestParam("descricao") String descricao) {
       return this.pr.findByDescricaoContainingIgnoreCase(descricao);
    }

}

