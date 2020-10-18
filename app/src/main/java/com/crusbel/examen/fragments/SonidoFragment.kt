package com.crusbel.examen.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.crusbel.examen.R
import com.crusbel.examen.adapters.RvAdapter
import com.crusbel.examen.model.Model


class SonidoFragment : Fragment() {

    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_sonido, container, false)
        val dataList = ArrayList<Model>()
        dataList.add(Model("SONY EQUIPO DE SONIDO HCDEX30", 1200.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP_5/2018229147565/2018229147565_2.jpg"))
        dataList.add(Model("SONY EQUIPO DE SONIDO SHAKS20", 1400.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP_5/2018229147541/2018229147541_2.jpg"))
        dataList.add(Model("SONY EQUIPO DE SONIDO CDSHX10", 1300.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP_3/2018190738427/2018190738427_2.jpg"))
        dataList.add(Model("SONY EQUIPO DE SONIDO SASHX50", 2200.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP_3/2018191449230/2018191449230-1.jpg"))
        dataList.add(Model("SONY EQUIPO DE SONIDO DCDEX40", 1400.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP_5/2018209244031/2018209244031_2.jpg"))
        dataList.add(Model("LG MINICOMPONENTE CM996", 1600.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP/2018176495917/2018176495917_2.jpg"))
        dataList.add(Model("PROLINK EQUIPO DE SONIDO", 1700.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP_5/2018243995999/2018243995999_2.jpg"))
        dataList.add(Model("SONY EQUIPO DE SONIDO DAW432", 2000.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP_4/2018194501294/2018194501294-1.jpg"))
        dataList.add(Model("LG MINICOMPONENTE", 2200.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP_5/2018238212865/2018238212865-2.jpg"))
        dataList.add(Model("SONY EQUIPO DE SONIDO HCSAE3", 1600.0,"Sistema de audio en casa de alta potencia con tecnología Bluetooth y luces LED.","https://home.ripley.com.pe/Attachment/WOP_3/2018191449247/2018191449247-1.jpg"))

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.setLayoutManager(LinearLayoutManager(view.context))
        recyclerView!!.setAdapter(RvAdapter(dataList,view.context))
        return view
    }
}