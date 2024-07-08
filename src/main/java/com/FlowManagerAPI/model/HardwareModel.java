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
@Table(name = "fma8t_hardware")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HardwareModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma8_id_hardware")
	private Long idHardware;

	@Column(name = "fma8_classe_hardware")
	private String classeHardware;
	
	@Column(name = "fma8_comprimento_hardware")
	private String comprimentoHardware;
	
	@Column(name = "fma8_material_hardware")
	private String materialHardware;
	
	@Column(name = "fma8_kanban_hardware")
	private String kanbanHardware;
	
	@Column(name = "fma8_fabricante_hardware")
	private String fabricanteHardware;
	
	@Column(name = "fma8_source_hardware")
	private String sourceHardware;
	
	@Column(name = "fma8_peso_hardware")
	private String pesoHardware;


}
