package com.example.flareui.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.flareui.R
import com.example.flareui.model.StartModel

class dialog_StartAdapter(
    var context: Context,
    var datalist: ArrayList<StartModel>,
    var OnClickListine: Onclickbtn
) : RecyclerView.Adapter<dialog_StartAdapter.ViewHolder>() {

    interface Onclickbtn {
        fun OnClickBtn(position: Int,img:ImageView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dialogstart_items, parent, false)
        return ViewHolder(view)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var mymodel = datalist[position]
        holder.txttile.text=mymodel.title.toString()

        holder.txttile.setOnClickListener {

            OnClickListine.OnClickBtn(position,holder.img)

        }
    }

    override fun getItemCount(): Int {
        return datalist.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var txttile = itemView.findViewById<TextView>(R.id.title_vehical)
        var img = itemView.findViewById<ImageView>(R.id.iv_itemimageview)



    }
}
