package web.PreProject311.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.PreProject311.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
