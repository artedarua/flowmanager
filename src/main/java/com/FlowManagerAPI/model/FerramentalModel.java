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
@Table(name = "fma7t_ferramental")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FerramentalModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma7_id_ferramental")
	private Long idFerramental;

	@Column(name = "fma7_classe_ferramental")
	private String classeFerramental;

	@Column(name = "fma7_descricao_ferramental")
	private String descricaoFerramental;

	@Column(name = "fma7_peso_desenho")
	private String pesoFerramental;

	@ManyToOne
	@JoinColumn(name = "fma7_usuario_roteiro", referencedColumnName = "fma5_id_Usuario")
	private UsuarioModel usuarioFerramental;

	public Long getIdFerramental() {
		return idFerramental;
	}

	public void setIdFerramental(Long idFerramental) {
		this.idFerramental = idFerramental;
	}

	public String getClasseFerramental() {
		return classeFerramental;
	}

	public void setClasseFerramental(String classeFerramental) {
		this.classeFerramental = classeFerramental;
	}

	public String getDescricaoFerramental() {
		return descricaoFerramental;
	}

	public void setDescricaoFerramental(String descricaoFerramental) {
		this.descricaoFerramental = descricaoFerramental;
	}

	public String getPesoFerramental() {
		return pesoFerramental;
	}

	public void setPesoFerramental(String pesoFerramental) {
		this.pesoFerramental = pesoFerramental;
	}

	public UsuarioModel getUsuarioFerramental() {
		return usuarioFerramental;
	}

	public void setUsuarioFerramental(UsuarioModel usuarioFerramental) {
		this.usuarioFerramental = usuarioFerramental;
	}

}
