package br.com.ailton.JotinhaStore.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.ailton.JotinhaStore.enumerations.PedidoStatusEnum;

@Entity
@Table(name = "Pedido")
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant momento;
	
	private PedidoStatusEnum pedidoStatus;
	
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Usuario cliente;
	
	@OneToMany(mappedBy = "id.pedido")
	private Set<PedidoItem> itens = new HashSet<>();
	
	public Pedido() {
		
	}

	public Pedido(Long id, Instant momento,PedidoStatusEnum pedidoStatus,  Usuario cliente) {
		super();
		this.id = id;
		this.momento = momento;
		this.pedidoStatus = pedidoStatus;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public PedidoStatusEnum getPedidoStatus() {
		return pedidoStatus;
	}

	public void setPedidoStatus(PedidoStatusEnum pedidoStatus) {
		this.pedidoStatus = pedidoStatus;
	}
	
	public Set<PedidoItem> getItens(){
		return itens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
}
