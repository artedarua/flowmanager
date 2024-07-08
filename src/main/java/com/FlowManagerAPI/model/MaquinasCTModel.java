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
@Table(name = "fma10t_maquinasCT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaquinasCTModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma10_id_maquinasCT")
	private Long idMaquinasCT;
	
	@Column(name = "fma10_codigo_maquinasCT")
	private String codigoMaquinasCT;
	
	@Column(name = "fma10_nome_maquinasCT")
	private String nomeMaquinasCT;
	
	@Column(name = "fma10_custo_hora_maquinasCT")
	private double custoHoraMaquinasCT;
	
	@Column(name = "fma10_custo_setup_maquinasCT")
	private double custoSetupMaquinasCT;
	
	@ManyToOne
	@JoinColumn(name = "fma10_medidas_maquinasCT", referencedColumnName = "fma9_id_medidas")
    private MedidasModel medidas;
	
	
}
