package com.panchalamitr.rxjavaoperators

data class User(
    var name: String = "",
    var gender: String = "",
    var email: String = "",
    var address: Address = Address()
)
