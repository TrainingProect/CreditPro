package count.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import count.model.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
