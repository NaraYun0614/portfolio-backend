package com.narayun.portfolio.controller;
import com.narayun.portfolio.model.Project;
import com.narayun.portfolio.repository.ProjectRepository;
import com.narayun.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProject() {
        return projectService.getAllProjects();
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }
}
