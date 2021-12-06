package com.dceta.projects

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("projects")
data class Project(@Id val id: Long, val title: String, val code: String)
