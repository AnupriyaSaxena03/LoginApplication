package com.example.loginapplication.repositories

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.loginapplication.data.AuthenticationDatabase
import com.example.loginapplication.data.entities.TableItem
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class AuthenticationRepo( private val db : AuthenticationDatabase)
                          //private val application: Application,
                         // private val mutableLiveData: MutableLiveData<FirebaseUser>,
                         // private val auth: FirebaseAuth
{


    suspend fun upsert(item:TableItem) = db.getAuthenticationDao().upsert(item)

    fun getAllUserData() = db.getAuthenticationDao().checkUser()



}