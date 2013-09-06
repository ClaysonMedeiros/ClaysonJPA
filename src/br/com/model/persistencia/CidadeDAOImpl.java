package br.com.model.persistencia;

import br.com.model.negosio.Cidade;
import br.com.senai.persistencia.dao.CidadeDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author clayson_medeiros
 */
public class CidadeDAOImpl extends DAOImpl<Cidade, Integer> implements CidadeDAO {

     public List<Cidade> getByNome (String nome){
        return getEntityManager().createQuery("select m from Cidade m where m.nome like '%" + nome + "%'").getResultList();
    }
     
     public Cidade getCidadeByNome(String nome) {
        Query q = getEntityManager().createQuery("select m from Cidade m where m.nome like '" + nome + "'", Cidade.class);
        List<Cidade> cidades = q.getResultList();
        Cidade cidade = new Cidade();
        for (Cidade c : cidades) {
            cidade = c;
        }
        return cidade;
    }
}
