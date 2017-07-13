package models;

import com.avaje.ebean.Model;
import play.db.ebean.ModelsConfigLoader;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Miguel, Roger, William *
 * Model que cria a tabela cliente.
 */
@Entity
public class Cliente extends Model {
    @Id
    public Integer id;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    public Usuario usuario_id;
    public static Model.Finder<Integer,Cliente> find = new Model.Finder<>(Cliente.class);

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = Usuario.find.byId(usuario_id);
    }

}
