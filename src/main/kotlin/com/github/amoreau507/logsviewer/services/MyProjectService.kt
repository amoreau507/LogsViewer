package com.github.amoreau507.logsviewer.services

import com.intellij.openapi.project.Project
import com.github.amoreau507.logsviewer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
