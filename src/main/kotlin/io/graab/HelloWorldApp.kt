package io.graab

import javafx.application.Application
import tornadofx.App

class HelloWorldApp : App(HelloWorld::class, Styles::class)

fun main(args: Array<String>) {
    Application.launch(HelloWorldApp::class.java, *args)
}