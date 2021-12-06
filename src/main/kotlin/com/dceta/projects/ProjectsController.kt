package com.dceta.projects

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProjectsController(val service: ProjectService) {

    @GetMapping
    fun getProjects(): List<Project> = listOf(
        Project(1, "First", "001"),
        Project(2, "Second", "002"),
        Project(3, "Third", "003"),
    )

    @PostMapping
    fun createProject(@RequestBody project: Project) {
        service.createProject(project)
    }
}
