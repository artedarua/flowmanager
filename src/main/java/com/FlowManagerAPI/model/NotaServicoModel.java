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
@Table(name = "fma6t_nota_servico")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotaServicoModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma6_id_nota_servico")
	private Long idNotaServico;
	
	@Column(name = "fma6_dataInicio_nota_servico")
	private String nomeDataInicio;
	
	@Column(name = "fma6_dataFinal_nota_servico")
	private String nomeDataFinal;
	
	@ManyToOne
    @JoinColumn(name = "fma6_produto_nota_servico") 
    private ProdutoModel produtoModel;
	
	@ManyToOne
    @JoinColumn(name = "fma6_roteiro_nota_servico") 
    private RoteiroModel roteiroModel;
	

	
	

}
