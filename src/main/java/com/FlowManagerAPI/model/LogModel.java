package com.FlowManagerAPI.model;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name = "fma99t_log")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma99_id_log")
	private Long idLog;

	@Column(name = "fma99_data_log")
	private LocalDateTime dataLog;
	
	@Column(name = "fma99_conteudo_hardware")
	private String conteudoLog;


	public LocalDateTime getDataLog() {
		return dataLog;
	}

	public void setDataLog(LocalDateTime dateAtual) {
		this.dataLog = dateAtual;
	}

	public String getConteudoLog() {
		return conteudoLog;
	}

	public void setConteudoLog(String conteudoLog) {
		this.conteudoLog = conteudoLog;
	}


	
	
}
