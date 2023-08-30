package com.example.flareui.model

import io.realm.RealmObject


open class Task(
    var id: String = "",
    var title: String = "",
    var description: String = ""
) : RealmObject()
