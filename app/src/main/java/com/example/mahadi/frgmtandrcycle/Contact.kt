package com.example.mahadi.frgmtandrcycle

/**
 * Created by Mahadi on 3/11/2018.
 */

class Contact {
    var name: String? = null
    var phn: String? = null
    var photo = 0

    constructor() {}
    constructor(name: String?, phn: String?, photo: Int) {
        this.name = name
        this.phn = phn
        this.photo = photo
    }

}