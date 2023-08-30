package com.example.flareui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flareui.Adapter.TaskAdapter
import com.example.flareui.R
import com.example.flareui.model.Task
import io.realm.Realm


class Fraghistory : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val View = inflater.inflate(R.layout.fragment_fraghistory, container, false)

        var btnsavedata = View.findViewById<Button>(R.id.btnsavedata)
        var recyclerView= View.findViewById<RecyclerView>(R.id.real_recview)

        Realm.init(View.context)

        loadreview(recyclerView)

        btnsavedata.setOnClickListener {
            savedata()
        }






        return View

    }

    private fun loadreview(recyclerView: RecyclerView) {
        val realm = Realm.getDefaultInstance()
        val tasks = realm.where(Task::class.java).findAll()


        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = TaskAdapter(tasks)

        realm.close()


    }

    private fun savedata() {
        val realm = Realm.getDefaultInstance()

// Execute a transaction to insert data
        realm.executeTransaction { realmInstance ->
            val task = Task().apply {
                title = "Sample Task"
                description = "This is a sample task description."
            }

            realmInstance.insert(task)
        }

// Close the Realm instance
        realm.close()
    }

}