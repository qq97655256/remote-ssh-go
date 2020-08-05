package com.github.qq97655256.remotesshgo.services

import com.intellij.openapi.project.Project
import com.github.qq97655256.remotesshgo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
