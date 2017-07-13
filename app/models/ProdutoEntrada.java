package models;

import com.avaje.ebean.Model;
import models.Produtos;
import play.data.format.Formats;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.sql.Date;

/**
 * @author Miguel, Roger, William *
 * Model criada para tabela de ProdutoEntrada.
 */
@Entity
public class ProdutoEntrada extends Model{

    @Id
    public Integer id;
    public int quantidade;
    public double valor;
    @Formats.DateTime(pattern="dd-MM-yyyy")
    public Date dataEntrada;

    @ManyToOne
    @JoinColumn(name="produtos_id")
    public Produtos produtos_id;


}
