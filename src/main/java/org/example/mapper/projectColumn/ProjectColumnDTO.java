package org.example.mapper.projectColumn;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProjectColumnDTO {
    private String name;
    private String order;
    private LocalDateTime createdAt;

}
