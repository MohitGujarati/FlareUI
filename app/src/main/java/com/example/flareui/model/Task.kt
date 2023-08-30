package com.example.flareui.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class Task(
    @PrimaryKey
    var id: Int = 0, // This will be auto-generated
    var title: String = "",
    var description: String = ""
) : RealmObject()
