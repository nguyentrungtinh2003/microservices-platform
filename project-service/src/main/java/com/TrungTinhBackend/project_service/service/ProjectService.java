package com.TrungTinhBackend.project_service.service;

import com.TrungTinhBackend.project_service.dto.ApiResponse;
import com.TrungTinhBackend.project_service.dto.ProjectDto;

public interface ProjectService {
    ApiResponse addProject(ProjectDto projectDto);
    ApiResponse getAllProject();
}
