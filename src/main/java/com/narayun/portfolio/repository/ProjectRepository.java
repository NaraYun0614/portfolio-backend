package com.narayun.portfolio.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.narayun.portfolio.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
}
