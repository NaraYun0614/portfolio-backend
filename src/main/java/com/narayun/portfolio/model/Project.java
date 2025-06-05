package com.narayun.portfolio.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="projects")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @ElementCollection
    private List<String> techStack;
    private String projectUrl;
    private String imageUrl;

    public Project(String title, String description, List<String> techStack, String projectUrl, String imageUrl) {
        this.title = title;
        this.description = description;
        this.techStack = techStack;
        this.projectUrl = projectUrl;
        this.imageUrl = imageUrl;
    }
}
