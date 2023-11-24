package com.senai.produtos;
// o * significa pra importar tudo.
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
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
    // endpoint: localhost:8080/api/produtos/searchName?nome=
    public List<Produto> getAllByName(@RequestParam("nome") String nome) {
        return this.pr.findByNomeContainingIgnoreCase(nome);
    }

    @GetMapping("searchDescription")
    // endpoint: localhost:8080/api/produtos/searchDescription?descricao=
    public List<Produto> getAllByDescription(@RequestParam("descricao") String descricao) {
       return this.pr.findByDescricaoContainingIgnoreCase(descricao);
    }



    @GetMapping("searchCategory")
    // endpoint: localhost:8080/api/produtos/searchCategory?categoria=
    public List<Produto> getAllByCategory(@RequestParam("categoria") String categoria) {
        return this.pr.findByCategoriaContainingIgnoreCase(categoria);
    }

    @GetMapping("searchCondition")
    // endpoint: localhost:8080/api/produtos/searchCondition?condicao=
    public List<Produto> getAllByCondition(@RequestParam("condicao") String condicao) {
        return this.pr.findByCondicaoContainingIgnoreCase(condicao);
    }

    @GetMapping("searchByPriceRange")
    // endpoint: localhost:8080/api/produtos/searchByPriceRange?valMin=10.0&valMax=50.0
    public List<Produto> searchByPriceRange(
            @RequestParam("valMin") double valMin,
            @RequestParam("valMax") double valMax) {
        return this.pr.findByValorBetween(valMin, valMax);
    }


}

