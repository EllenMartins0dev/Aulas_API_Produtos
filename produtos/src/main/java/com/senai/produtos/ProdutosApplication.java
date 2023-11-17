package com.senai.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import java.util.Arrays;

@SpringBootApplication
public class ProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}

	@Bean
	CommandLineRunner criarProdutos(ProdutoRepository pr) {
		return args -> {
			pr.deleteAll();
			Produto pr1 = new Produto("Tênis Nike azul", "Tênis Nike azul", CategoriaEnum.TENIS.getCategoria(), 150.90);
			Produto pr2 = new Produto("Sapatilha Melissa branca", "Sapatilha Melissa branca", CategoriaEnum.SAPATILHA.getCategoria(), 100.99);
			Produto pr3 = new Produto("Tênis Adidas preto", "Tênis Adida preto", CategoriaEnum.TENIS.getCategoria(), 198.00);
			Produto pr4 = new Produto("Bota coturno preta", "Bota coturno preta", CategoriaEnum.BOTA.getCategoria(), 213.00);
			Produto pr5 = new Produto("All star vermelho", "All star vermelho", CategoriaEnum.TENIS.getCategoria(), 189.00);
			Produto pr6 = new Produto("Chinelo Havaianas verde", "Chinelo Havaianas verde", CategoriaEnum.CHINELO.getCategoria(), 49.60);
			Produto pr7 = new Produto("Chinelo Havaianas marrom", "Chinelo Havaianas marrom", CategoriaEnum.CHINELO.getCategoria(), 49.60);
			Produto pr8 = new Produto("Sapatilha Melissa Rose", "Sapatilha Melissa Rose", CategoriaEnum.SAPATILHA.getCategoria(), 100.99);
			Produto pr9 = new Produto("Papete Melissa Roxa", "Papete Melissa Roxa", CategoriaEnum.SANDALIA.getCategoria(), 112.00);
			Produto pr10 = new Produto("Papete Melissa Azul", "Papete Melissa Roxa", CategoriaEnum.SANDALIA.getCategoria(), 112.00);
			Produto pr11 = new Produto("Tênis Nike preto", "Tênis Nike preto", CategoriaEnum.TENIS.getCategoria(), 150.90);
			Produto pr12 = new Produto("Tênis Nike amarelo", "Tênis Nike amarelo", CategoriaEnum.TENIS.getCategoria(), 150.90);
			Produto pr13 = new Produto("Rasteirinha de brilho rosa", "Rasteirinha de brilho rosa", CategoriaEnum.CHINELO.getCategoria(), 65.90);
			Produto pr14 = new Produto("Rasteirinha de brilho laranja", "Rasteirinha de brilho laranja", CategoriaEnum.CHINELO.getCategoria(), 65.90);
			Produto pr15 = new Produto("Chinelo Ipanema preto", "Chinelo Ipanema preto", CategoriaEnum.CHINELO.getCategoria(), 20.00);
			Produto pr16 = new Produto("Chinelo Ipanema roxo", "Chinelo Ipanema roxo", CategoriaEnum.CHINELO.getCategoria(), 20.00);
			Produto pr17 = new Produto("Bota Coturno prata", "Bota Coturno prata", CategoriaEnum.BOTA.getCategoria(), 213.00);
			Produto pr18 = new Produto("Bota Coturno branca", "Bota Coturno branca", CategoriaEnum.BOTA.getCategoria(), 213.00);
			Produto pr19 = new Produto("Sandália Melissa verde", "Sapatilha Melissa verde", CategoriaEnum.SANDALIA.getCategoria(), 79.99);
			Produto pr20 = new Produto("Sandália Melissa creme", "Sapatilha Melissa creme", CategoriaEnum.SANDALIA.getCategoria(), 79.99);

			pr.saveAll(Arrays.asList(pr1,pr2,pr3,pr4,pr5,pr6,pr7,pr8,pr9,pr10,pr11,pr12,pr13,pr14,pr15,pr16,pr17,pr18,pr19,pr20));
		};

	}

}
