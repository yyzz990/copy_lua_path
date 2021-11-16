package com.github.yyzz990.copyluapath.services

import com.intellij.openapi.project.Project
import com.github.yyzz990.copyluapath.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
