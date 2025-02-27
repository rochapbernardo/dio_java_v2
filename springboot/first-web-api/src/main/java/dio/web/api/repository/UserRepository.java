package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario user){
        if(user.getId()==null){
            System.out.println("SAVE - Recebendo o usuário  na camada repositório");
        }else{
            System.out.println("UPDATE - Recebendo o usuário  na camada repositório");
        }
        System.out.println(user);
    }

    public void deleteById(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("rochapbernardo", "password"));
        usuarios.add(new Usuario("chesquinigio", "password123"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.printf("FIND/ID - Recebendo o id: %d para localizar um usuário", id);
        return new Usuario("rochapbernardo", "password");
    }

    public Usuario findByUsername(String username){
        System.out.printf("FIND/username - Recebendo o username: %s para localizar um usuário", username);
        return new Usuario("rochapbernardo", "password");
    }
}
