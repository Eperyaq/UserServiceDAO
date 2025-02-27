package com.conexionDataBase.dao

import com.conexionDataBase.entity.UserEntity
import java.util.*

interface IUserDAO {
    fun create(user: UserEntity):UserEntity?
    fun getAll(): List<UserEntity>?
    fun getById(id: UUID): UserEntity?
    fun update(user: UserEntity):UserEntity?
    fun delete(id: UUID):Boolean
}