package com.example.flareui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

import com.example.flareui.R
import com.google.android.material.button.MaterialButton


class FragActivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val View= inflater.inflate(R.layout.fragment_frag_activity, container, false)

        val btn_manualMode=View.findViewById<Button>(R.id.btn_manualMode)

        btn_manualMode.setOnClickListener {
            Toast.makeText(View.context, "hello world", Toast.LENGTH_SHORT).show()
        }




        return View

    }

}