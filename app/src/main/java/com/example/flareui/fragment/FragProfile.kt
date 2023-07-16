package com.example.flareui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import androidx.fragment.app.Fragment
import com.example.flareui.R

class FragProfile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val View = inflater.inflate(R.layout.fragment_frag_profile, container, false)

        val switchButton =View. findViewById<SwitchCompat>(R.id.switchButton)
        val statusTextView = View.findViewById<TextView>(R.id.statusTextView)

        switchButton.setOnCheckedChangeListener { _, isChecked ->
            val status = if (isChecked) "On" else "Off"
            statusTextView.text = status
            Toast.makeText(View.context, "Switch turned $status", Toast.LENGTH_SHORT).show()
        }



        return View

    }


}