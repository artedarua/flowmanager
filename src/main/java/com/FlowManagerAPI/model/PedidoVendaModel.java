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
@Table(name = "fma6t_pedido_venda")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PedidoVendaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fma6_id_pedido_venda")
	private Long idPedidoVenda;

	@Column(name = "fma6_num_pedido_venda")
	private String numPedidoVenda;

	@Column(name = "fma6_descricao_pedido_venda")
	private String descricaoPedidoVenda;

	@Column(name = "fma6_data_cadastro_pedido_venda")
	private Date dataCadastroPedidoVenda;

	@Column(name = "fma6_data_revisao_pedido_venda")
	private Date dataRevisaoPedidoVenda;

	@Column(name = "fma6_qteItens_pedido_venda")
	private int qteItens;

	@Column(name = "fma6_status_pedido_venda")
	private boolean statusoPedidoVenda;

	@ManyToOne
	@JoinColumn(name = "fma6_produto_pedido_venda", referencedColumnName = "fma1_id_produto")
	private ProdutoModel produtoPedidoVenda;
}
