package app.ecom.sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.ecom.sb.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}