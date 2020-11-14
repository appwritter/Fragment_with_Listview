//JAVA: ei file ta ami korecilam JAVA Program die ... tai JAVA code ta die rakhlam .
// ar JAVA die jeta korecilam ... tar tutorial die rakhlam
/**
 * Video Tutorial Link dilam ... For JAVA ar kotlin file to eikhanei ase
 * https://drive.google.com/file/d/1s5xM6M7DB0owGVilR_L-3voLzzMxRY24/view?usp=sharing
 */
/**package com.example.fragmentlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

FragmentManager manager=getSupportFragmentManager();
FragmentTransaction t=manager.beginTransaction();
Myfrag1 ml = new Myfrag1();
t.add(R.id.frame1,ml);
t.commit();
}

public void fl(String s) {
FragmentManager managerl = getSupportFragmentManager();
FragmentTransaction t1 = managerl.beginTransaction();
Myfrag2 m22=new Myfrag2();
Bundle b2= new Bundle();
b2.putString("s",s);
m22.setArguments(b2);
t1.replace(R.id.frame1,m22);
t1.commit();



}
}


 **/



package com.example.fragmentlistview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val manager = supportFragmentManager
        val t = manager.beginTransaction()
        val ml = Myfrag1()
        t.add(R.id.frame1, ml)
        t.commit()
    }

    fun fl(s: String?) {
        val managerl = supportFragmentManager
        val t1 = managerl.beginTransaction()
        val m22 = Myfrag2()
        val b2 = Bundle()
        b2.putString("s", s)
        m22.arguments = b2
        t1.replace(R.id.frame1, m22)
        t1.commit()
    }
}