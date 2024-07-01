package project.management.applicationManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.management.applicationManagement.model.Project;
import project.management.applicationManagement.service.projectService;

@RestController
@RequestMapping("/api/projects")
public class projectController {

    @Autowired
    private projectService projectService;

    @PostMapping
    public Project createProject(@RequestBody Project project){
        return projectService.saveProject(project);
    }
}
