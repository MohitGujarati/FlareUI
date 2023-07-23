package com.example.flareui.fragment

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flareui.Adapter.dialog_StartAdapter

import com.example.flareui.R
import com.example.flareui.model.StartModel
import com.google.android.material.bottomsheet.BottomSheetDialog


class FragActivity : Fragment() {

    lateinit var btnstart: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val View = inflater.inflate(R.layout.fragment_frag_activity, container, false)

        val btn_manualMode = View.findViewById<Button>(R.id.btn_manualMode)

        btnstart = View.findViewById(R.id.btnstart)

        btn_manualMode.setOnClickListener {
            Toast.makeText(View.context, "hello world", Toast.LENGTH_SHORT).show()
        }


        btnstart.setOnClickListener {


            opendialog(View)

        }



        return View

    }

    @SuppressLint("SuspiciousIndentation")
    private fun opendialog(view: View) {

        var d = BottomSheetDialog(view.context)
        d.setContentView(R.layout.dilaog_start)
        d.setCancelable(true)
        d.show()

        val recview = d.findViewById<RecyclerView>(R.id.rec_startdialog)

        recview?.layoutManager = LinearLayoutManager(view.context)

        val startArraylist = ArrayList<StartModel>()

            startArraylist.add(
                StartModel(
                    "item 1",
                )
            )

            startArraylist.add(
                StartModel(
                    "item 2",
                )
            )

            startArraylist.add(
                StartModel(
                    "item 3",
                )
            )

        val adapter =
            dialog_StartAdapter(view.context, startArraylist,object :dialog_StartAdapter.Onclickbtn{
                override fun OnClickBtn(position: Int, img: ImageView) {
                    var flag=false
                    if (flag){
                        img.visibility=View.GONE
                        flag=false
                    }else{
                        img.visibility=View.VISIBLE
                        flag=true
                    }


                }
            })
        adapter.notifyDataSetChanged()
        recview?.adapter = adapter





    }

}