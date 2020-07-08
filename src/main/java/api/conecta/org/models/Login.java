/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
  *@Versão da Classe = 1
 */

package api.conecta.org.models;

import java.util.Date;

import javax.persistence.Column;
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
@Table(name = "login", catalog = "", schema = "public")
public class Login {
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@JsonProperty("pessoa")
	@JoinColumn(name = "id_pessoa_login", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_PESSOA_LOGIN"))
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Pessoa pessoa;

	@JsonProperty("usuario")
	@Column(name="usuario", unique=true, nullable=false)
	private String usuario;

	@JsonProperty("password")
	private String password;
	
	@JsonProperty("ativo")
	private String ativo;

	@Temporal(TemporalType.DATE)
	private Date criado_em;

	@Temporal(TemporalType.DATE)
	private Date atualizado_em;

	@Temporal(TemporalType.DATE)
	private Date deletado_em;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
