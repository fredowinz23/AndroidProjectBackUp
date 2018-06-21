package com.example.fredowinz23.samplecrud

/**
 * Created by fredowinz23 on 6/21/2018.
 */
class Note {

    var id: Int? = null
    var title: String? = null
    var content: String? = null

    constructor(id: Int, title: String, content: String) {
        this.id = id
        this.title = title
        this.content = content
    }

}