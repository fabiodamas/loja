package br.com.fabio.userapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fabio.userapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> queryByNomeLike(String name);

    User findByCpf(String cpf);
}
