package project.com.user.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.com.user.management.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
