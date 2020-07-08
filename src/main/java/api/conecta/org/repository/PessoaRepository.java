/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
  *@Versão da Classe = 1
 */

package api.conecta.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.conecta.org.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	Pessoa findById(long id);

}
