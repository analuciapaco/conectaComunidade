/**
 * @Organização: Conecta Comunidade
 * @author: Ana Lúcia Seles
  *@Versão da Classe = 1
 */

package api.conecta.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.conecta.org.models.Familia;

public interface FamiliaRepository extends JpaRepository<Familia, Long> {

	Familia findById(long id);

}
