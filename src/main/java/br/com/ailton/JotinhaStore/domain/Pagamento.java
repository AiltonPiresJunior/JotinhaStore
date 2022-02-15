package br.com.ailton.JotinhaStore.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Pagamento")
public class Pagamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pagamento_id;
	private Instant momento;
		
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
	
	public Pagamento() {
		
	}

	public Pagamento(Long pagamento_id, Instant momento, Pedido pedido_id) {
		this.pagamento_id = pagamento_id;
		this.momento = momento;
		this.pedido = pedido_id;
	}

	public Long getPagamentoId() {
		return pagamento_id;
	}

	public void setId(Long pagamento_id) {
		this.pagamento_id = pagamento_id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pagamento_id == null) ? 0 : pagamento_id.hashCode());
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
		Pagamento other = (Pagamento) obj;
		if (pagamento_id == null) {
			if (other.pagamento_id != null)
				return false;
		} else if (!pagamento_id.equals(other.pagamento_id))
			return false;
		return true;
	}
	
	
	
	
}
