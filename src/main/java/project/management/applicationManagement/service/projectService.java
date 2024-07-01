package project.management.applicationManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.management.applicationManagement.repository.projectRepository;
import project.management.applicationManagement.model.Project;

@Service
public class projectService {
    @Autowired
    private projectRepository projectRepository;

    public Project saveProject(Project project){
        return projectRepository.save(project);
    }
}
