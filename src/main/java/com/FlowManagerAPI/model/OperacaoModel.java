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
@Table(name = "fma13t_operacao")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class OperacaoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma13_id_operacao")
	private Long idOperacao;

	@Column(name = "fma13_seq_operacao")
	private String seqOperacao;

	@Column(name = "fma13_cod_operacao")
	private String codOperacao;

	@Column(name = "fma13_desc_operacao")
	private String descOperacao;

	@Column(name = "fma13_tempo_setup_operacao")
	private double tempoSetupOperacao;

	@Column(name = "fma13_tempo_peca_operacao")
	private double tempoPecaOperacao;

	@Column(name = "fma13_total_operacao")
	private double tempoTotalOperacao;

	@Column(name = "fma13_status_operacao")
	private double statusOperacao;

}
