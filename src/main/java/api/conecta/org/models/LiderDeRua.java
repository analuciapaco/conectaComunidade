/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
 * @Versão da Classe = 1
 */

package api.conecta.org.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "LIDER_DE_RUA", catalog = "", schema = "public")
public class LiderDeRua {
	@JsonProperty("id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("pessoa")
	@JoinColumn(name = "id_pessoa", referencedColumnName = "id", nullable = true, foreignKey = @ForeignKey(name = "FK_PESSOA_LIDER"))
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Pessoa pessoa;
	
	@JsonProperty("ativo")
	private String ativo;

	@JsonProperty("agenteComunitario")
	@JoinColumn(name = "id_pessoa_agente_comunitario", nullable = true, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_PESSOA_AGENTE_COMUNITARIO"))
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Pessoa agenteComunitario;
	@JsonProperty("observacao")
	private String observacao;
	@JsonProperty("numeroDeFamilias")
	private Long numeroDeFamilias;
	

	@Temporal(TemporalType.DATE)
	private Date criado_em;

	@Temporal(TemporalType.DATE)
	private Date atualizado_em;

	@Temporal(TemporalType.DATE)
	private Date deletado_em;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Long getNumeroDeFamilias() {
		return numeroDeFamilias;
	}

	public void setNumeroDeFamilias(Long numeroDeFamilias) {
		this.numeroDeFamilias = numeroDeFamilias;
	}

	public Pessoa getAgenteComunitario() {
		return agenteComunitario;
	}

	public void setAgenteComunitario(Pessoa agenteComunitario) {
		this.agenteComunitario = agenteComunitario;
	}

	public Date getCriado_em() {
		return criado_em;
	}

	public void setCriado_em(Date criado_em) {
		this.criado_em = criado_em;
	}

	public Date getAtualizado_em() {
		return atualizado_em;
	}

	public void setAtualizado_em(Date atualizado_em) {
		this.atualizado_em = atualizado_em;
	}

	public Date getDeletado_em() {
		return deletado_em;
	}

	public void setDeletado_em(Date deletado_em) {
		this.deletado_em = deletado_em;
	}
	
	

}
