package project.management.applicationManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.management.applicationManagement.model.Project;

public interface projectRepository extends JpaRepository<Project, Long> {
}
