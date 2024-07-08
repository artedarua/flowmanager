package com.FlowManagerAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fma3t_material")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MaterialModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma3_id_material")
	private Long idmaterial;
	
	@Column(name = "fma3_classe_material")
	private String classeMaterial;
	
	@Column(name = "fma3_descricao_material")
	private String descricaoMaterial;
	
	@Column(name = "fma3_medidas_material")
	private String medidasMaterial;
	
	@Column(name = "fma2_liga_material")
	private String ligaMaterial;

	@Column(name = "fma3_peso_material")
	private String pesoMaterial;
	
	@Column(name = "fma3_unidade_medida_material")
	private String unidadeMedidaMaterial;
	
	@Column(name = "fma3_lote_material")
	private String loteMaterial;
	
	
}
