package com.conexionDataBase.output

import com.conexionDataBase.entity.UserEntity

interface IOutputInfo {

    fun showMessage(message: String, lineBreak:Boolean = true)

    fun show(userList:List<UserEntity>?,message:String = "All users")
}