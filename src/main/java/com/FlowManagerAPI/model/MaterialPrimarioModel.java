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
@Table(name = "fma3t_materialPrimario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MaterialPrimarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma3_id_materialPrimario")
	private Long idMaterialPrimario;
	
	@Column(name = "fma3_nome_materialPrimario")
	private String nomeMaterialPrimario;
	
	@Column(name = "fma2_tipo_MaterialPrimario")
	private String tipoMaterialPrimiario;
	
	@Column(name = "fma2_local_MaterialPrimario")
	private String localMaterialPrimario;
	
	@Column(name = "fma2_quantidade_MaterialPrimario")
	private String quantidadeMaterialPrimario;
	
	@ManyToOne
    @JoinColumn(name = "fma2_fornecedor_MaterialPrimario") 
    private FornecedorModel fornecedorMaterialPrimario;
	
	@Column(name = "fma2_obs_MaterialPrimario")
	private String tipoMaterialPrimario;
	
	
}
