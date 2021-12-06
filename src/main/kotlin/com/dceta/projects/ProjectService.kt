package com.dceta.projects

import org.springframework.stereotype.Service

@Service
class ProjectService(val repository: ProjectRepository) {

    fun findProjects(): List<Project> = repository.findProjects()

    fun createProject(project: Project) {
        repository.save(project)
    }

}
