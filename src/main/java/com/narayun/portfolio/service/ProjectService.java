package com.narayun.portfolio.service;
import com.narayun.portfolio.model.Project;
import com.narayun.portfolio.repository.ProjectRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @PostConstruct
    public void init() {
        if (projectRepository.count() == 0) {
            projectRepository.save(new Project(
                    "Game Shop Web App",
                    "Full-stack web app for managing game inventory and orders.",
                    List.of("Vue.js", "Spring Boot","PostgreSQL"),
                    "https://github.com/NaraYun0614/Game-Store",
                    "/project-images/Game-Shop.png"


            ));

            projectRepository.save(new Project(
                    "Virtual Doctor Chatbot",
                    "AI chatbot for humorous medical Q&A, built at McHacks.",
                    List.of("Python", "Langchain", "OpenAI API"),
                    "https://github.com/NaraYun0614/Virtual-Doctor-ChatBot",
                    "/project-images/Doctor-ChatBot.png"
            ));

            projectRepository.save(new Project(
                    "Portfolio Website",
                    "This portfolio site built with React and Spring Boot.",
                    List.of("React", "Tailwind CSS", "Spring Boot", "PostgreSQL"),
                    "https://github.com/NaraYun0614/portfolio-frontend",
                    "/project-images/portfolio.png"
            ));
        }
    }
}
