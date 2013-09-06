package br.com.senai.persistencia.dao;

import br.com.model.negosio.Cidade;
import java.util.List;

/**
 *
 * @author clayson_medeiros
 */
public interface CidadeDAO extends DAO<Cidade, Integer>{      
    List<Cidade> getByNome (String nome);
    Cidade getCidadeByNome(String nome);
}
