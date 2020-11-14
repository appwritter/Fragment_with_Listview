package com.example.fragmentlistview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import java.util.*

class Myfrag1 : Fragment() {

    var al: ArrayList<String>? = null
    var aa: ArrayAdapter<String>? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_myfrag1, container, false)
        val lv = v.findViewById<ListView>(R.id.list1)
        al = ArrayList()
        aa = ArrayAdapter(activity!!, android.R.layout.simple_list_item_1, al!!)
        lv.setAdapter(aa)
        al!!.add("Bengali")
        al!!.add("shalifi")
        al!!.add("Bengali")
        al!!.add("shafi")
        lv.setOnItemClickListener(OnItemClickListener { parent, view, position, id ->
            val s = al!![position]
            val mnl = activity as MainActivity?
            mnl!!.fl(s)
        })
        return v
    }
}