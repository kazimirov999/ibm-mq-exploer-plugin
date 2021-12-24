package com.github.kazimirov999.ibmmqexploerplugin.services

import com.intellij.openapi.project.Project
import com.github.kazimirov999.ibmmqexploerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
