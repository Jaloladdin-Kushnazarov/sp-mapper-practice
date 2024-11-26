package org.example.mapper.project;

import lombok.*;
import org.example.mapper.projectColumn.ProjectColumn;
import org.example.mapper.projectColumn.ProjectColumnDTO;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO {
    private String name;
    private String documentPath;
    private List<ProjectColumnDTO> projectColumnDTOs;
    private String createdAt;
}
