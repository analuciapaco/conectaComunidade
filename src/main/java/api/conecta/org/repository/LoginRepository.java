/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
  *@Versão da Classe = 1
 */

package api.conecta.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.conecta.org.models.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

	Login findById(long id);
	Login findByUsuario(String nome);

}
