package models;

import com.avaje.ebean.Model;
import models.Produtos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.sql.Date;

/**
 * Created by William on 01/05/2017.
 */
@Entity
public class ProdutoEntrada extends Model{

    @Id
    public long id;
    public int quantidade;
    public double valor;
    public Date dataEntrada;

    @ManyToOne
    @JoinColumn(name="produtos_id")
    public Produtos produtos_id;


}