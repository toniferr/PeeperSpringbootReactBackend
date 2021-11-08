package com.toni.PeeperSpringbootReactBackend.Repository;

import com.toni.PeeperSpringbootReactBackend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
