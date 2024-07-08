package com.FlowManagerAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fma9t_medidas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedidasModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma9_id_medidas")
	private Long idMedidas;
	
	@Column(name = "fma9_descricao_medidas")
	private String descricaoMedidas;
	
	@Column(name = "fma9_valor_medidas")
	private double valorMedidas;
	
	@Column(name = "fma9_desvio_superior_medidas")
	private double desvioSuperiorMedidas;
	
	@Column(name = "fma9_desvio_inferior_medidas")
	private double desvioInferiorMedidas;
	
	@Column(name = "fma9_conforme_medidas")
	private double conformeMedidas;
	
	

}
