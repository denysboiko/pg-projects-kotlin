package com.dceta.projects

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ProjectRepository : CrudRepository<Project, Long> {

    @Query("select * from projects")
    fun findProjects(): List<Project>
}
