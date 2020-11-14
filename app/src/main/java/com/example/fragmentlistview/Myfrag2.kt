//JAVA CODE Here

/*
package com.example.fragmentlistview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Myfrag2 extends Fragment {
        TextView t;

    public Myfrag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_myfrag2, container, false);
        t= (TextView) v.findViewById(R.id.text1);
        Bundle b = getArguments();
        if (b!=null){
            String s=b.getString("s");
            t.setText(s);
        }
        return v;

    }
}
 */

package com.example.fragmentlistview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Myfrag2 : Fragment() {
    var t: TextView? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_myfrag2, container, false)
        t = v.findViewById<View>(R.id.text1) as TextView
        val b = arguments
        if (b != null) {
            val s = b.getString("s")
            t!!.text = s
        }
        return v
    }
}