package org.example.mapper.project;

import lombok.*;
import org.example.mapper.projectColumn.ProjectColumn;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private String id;
    private String name;
    private Path documentPath;
    private List<ProjectColumn> projectColumns;
    private LocalDateTime createdAt;
}
