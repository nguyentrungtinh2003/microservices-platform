package com.TrungTinhBackend.project_service.service;

import com.TrungTinhBackend.project_service.dto.ApiResponse;
import com.TrungTinhBackend.project_service.dto.ProjectDto;
import com.TrungTinhBackend.project_service.entity.Project;
import com.TrungTinhBackend.project_service.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public ApiResponse addProject(ProjectDto projectDto) {
        ApiResponse apiResponse = new ApiResponse();

        Project project = new Project();
        project.setName(projectDto.getName());
        project.setDescription(projectDto.getDescription());
        project.setImg(projectDto.getImg());
        project.setStartDate(projectDto.getStartDate());
        project.setEndDate(projectDto.getEndDate());
        project.setDeleted(false);

        projectRepository.save(project);

        apiResponse.setStatusCode(200L);
        apiResponse.setMessage("Add project success");
        apiResponse.setTimestamp(LocalDateTime.now());

        return apiResponse;
    }

    @Override
    public ApiResponse getAllProject() {
        return null;
    }
}
