package com.generation.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter // set 
@Setter // get 
@Entity
@Table(name ="tb_produto") // nome da tabela no mysql
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank // não pode ser nulo 
	@Size(max = 50)
	private String nome;
	
	@NotBlank
	@Size(max = 255)
	private String descricao;
	
	@NotBlank
	private Long valor;
	
	
	
}