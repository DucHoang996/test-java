package test.example.test_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.example.test_project.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
