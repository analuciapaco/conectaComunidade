/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
  *@Versão da Classe = 1
 */

package api.conecta.org.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "FAMILIA", catalog = "", schema = "public")
public class Familia {
	
	@JsonProperty("id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("liderDeRua")
	@JoinColumn(name = "id_pessoa_lider", referencedColumnName = "id", nullable = true, foreignKey = @ForeignKey(name = "FK_PESSOA_LIDER"))
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Pessoa liderDeRua;
	
	@JsonProperty("representanteFamilia")
	@JoinColumn(name = "id_pessoa_representante", referencedColumnName = "id", nullable = true, foreignKey = @ForeignKey(name = "FK_PESSOA_REPRESENTANTE_FAMILIA"))
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Pessoa representanteFamilia;
	
	@JsonProperty("numeroDeCriancas")
	private Integer numeroDeCriancas;
	
	@JsonProperty("numeroDeIdosos")
	private Integer numeroDeIdosos;
	
	@JsonProperty("numeroDeAdultos")
	private Integer numeroDeAdultos;
	
	@JsonProperty("totalHabitantes")
	private Integer totalHabitantes;
	
	@JsonProperty("observacao")
	private String observacao;
	
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

	public Pessoa getLiderDeRua() {
		return liderDeRua;
	}

	public void setLiderDeRua(Pessoa liderDeRua) {
		this.liderDeRua = liderDeRua;
	}

	public Pessoa getRepresentanteFamilia() {
		return representanteFamilia;
	}

	public void setRepresentanteFamilia(Pessoa representanteFamilia) {
		this.representanteFamilia = representanteFamilia;
	}

		public Integer getNumeroDeCriancas() {
		return numeroDeCriancas;
	}

	public void setNumeroDeCriancas(Integer numeroDeCriancas) {
		this.numeroDeCriancas = numeroDeCriancas;
	}

	public Integer getNumeroDeIdosos() {
		return numeroDeIdosos;
	}

	public void setNumeroDeIdosos(Integer numeroDeIdosos) {
		this.numeroDeIdosos = numeroDeIdosos;
	}

	public Integer getNumeroDeAdultos() {
		return numeroDeAdultos;
	}

	public void setNumeroDeAdultos(Integer numeroDeAdultos) {
		this.numeroDeAdultos = numeroDeAdultos;
	}

	public Integer getTotalHabitantes() {
		return totalHabitantes;
	}

	public void setTotalHabitantes(Integer totalHabitantes) {
		this.totalHabitantes = totalHabitantes;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
