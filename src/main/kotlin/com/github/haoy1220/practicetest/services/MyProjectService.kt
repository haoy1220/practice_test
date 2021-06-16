package com.github.haoy1220.practicetest.services

import com.github.haoy1220.practicetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
