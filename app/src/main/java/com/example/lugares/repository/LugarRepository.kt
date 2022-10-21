package com.example.lugares.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.lugares.data.LugarDao
import com.example.lugares.model.Lugar

class LugarRepository (private val lugarDao: LugarDao) {
    val getAllData: LiveData<List<Lugar>> = lugarDao.getAllData()

    //Metodo de LugarDao en una capa superior
    suspend fun addLugar(lugar: Lugar){
        lugarDao.addLugar(lugar)
    }
    //Llamada asincronica a las clases de LugarDao
    suspend fun updateLugar(lugar: Lugar){
        lugarDao.updateLugar(lugar)
    }
    suspend fun deleteLugar(lugar: Lugar){
        lugarDao.deleteLugar(lugar)
    }
}