package br.com.model.negosio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author clayson_medeiros
 */
@Entity
public class Aluno implements Serializable{
    @Id
    @Column(name="i_aluno")
    @GeneratedValue
    private int codigo;   
    private String nome; 
    @ManyToOne
    @JoinColumn(name = "i_cidade", referencedColumnName = "i_cidade")
    private Cidade cidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
    
}