package com.example.flareui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.flareui.R
import io.realm.Realm
import io.realm.kotlin.Realm


class Fraghistory : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val View = inflater.inflate(R.layout.fragment_fraghistory, container, false)

        var btnsavedata=View.findViewById<Button>(R.id.btnsavedata)


        Realm.init(View.context)

        btnsavedata.setOnClickListener {
            savedata()
        }






        return View

    }

    private fun savedata() {
        val realm=Realm.getDefaultInstance()

        realm.beginTransaction()
    }

}