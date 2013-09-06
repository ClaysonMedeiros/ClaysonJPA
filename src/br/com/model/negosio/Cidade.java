package br.com.model.negosio;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author clayson_medeiros
 */
@Entity
public class Cidade implements Serializable{
    @Column(name = "i_cidade")
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private String uf;

    public String toString(){
        return nome;
    }
    
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}