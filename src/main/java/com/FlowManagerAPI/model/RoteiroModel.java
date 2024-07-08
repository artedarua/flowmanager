package com.FlowManagerAPI.model;

import java.sql.Date;

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
@Table(name = "fma4t_roteiro")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class RoteiroModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma4_id_roteiro")
	private Long idRoteiro;
	
	@Column(name = "fma4_ordem_servico_roteiro")
	private String ordemServicoRoteiro;
	
	@Column(name = "fma4_descricao_roteiro")
	private String descricaoRoteiro;
	
	@Column(name = "fma4_emproducao_roteiro")
	private boolean emProducaoRoteiro;
	
	@Column(name = "fma4_data_inicio_roteiro")
	private Date dataInicioRoteiro;
	
	@Column(name = "fma4_data_entrega_roteiro")
	private Date dataEntregaRoteiro;
	
	@ManyToOne
	@JoinColumn(name = "fma4_material_roteiro", referencedColumnName = "fma3_id_material")
    private MaterialModel material;
	
	@ManyToOne
	@JoinColumn(name = "fma4_hardware_roteiro", referencedColumnName = "fma8_id_hardware")
    private HardwareModel hardware;
	
	@ManyToOne
	@JoinColumn(name = "fma4_feramental_roteiro", referencedColumnName = "fma7_id_ferramental")
    private FerramentalModel ferramental;
	
	@ManyToOne
	@JoinColumn(name = "fma4_maqinasct_roteiro", referencedColumnName = "fma10_id_maquinasCT")
    private MaquinasCTModel maquinasCT;
		
}
