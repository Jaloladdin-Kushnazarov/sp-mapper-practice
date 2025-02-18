package org.example.mapper.project;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Mapper
public interface ProjectMapper {
    ProjectMapper PROJECT_MAPPER = Mappers.getMapper(ProjectMapper.class);

    @Mapping(source = "documentPath", target = "documentPath", qualifiedByName = "pahtToString")
    @Mapping(source = "projectColumns", target = "projectColumnDTOs")
    @Mapping(source = "createdAt", target = "createdAt", dateFormat = "dd.MM.YYYY")//date ni formatlash
    ProjectDTO toDTO(Project project);

    @Named("pahtToString")
    default String pahtToString(Path path) {
        if (path == null) {
            return null;
        }
        return path.toString();
    }


}