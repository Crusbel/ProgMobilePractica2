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


class CelularFragment : Fragment() {

    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_celular, container, false)
        val dataList = ArrayList<Model>()
        dataList.add(Model("Motorola One", 2200.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065251071870/2065251071870_2.jpg"))
        dataList.add(Model("Huawei P30 Lite", 2400.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065226560675/2065226560675_2.jpg"))
        dataList.add(Model("LG G8X", 2200.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065251169485/2065251169485_2.jpg"))
        dataList.add(Model("Huawei Y9 2019", 1800.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065226560590/2065226560590_2.jpg"))
        dataList.add(Model("Samsung Galaxy A20S", 2000.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065240635991/2065240635991_2.jpg"))
        dataList.add(Model("Apple Iphone 11", 3400.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065245898346/2065245898346_2.jpg"))
        dataList.add(Model("Motorola Moto G6", 1500.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065227502964/2065227502964_2.jpg"))
        dataList.add(Model("LG K50S", 1700.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065249398743/2065249398743_2.jpg"))
        dataList.add(Model("Samsung Galaxy A01", 1200.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065251601374/2065251601374_2.jpg"))
        dataList.add(Model("Huawei Y9 Prime", 1500.0,"Descubre todos los detalles a tu alrededor con el poderoso smartphone One Macro de Motorola. Di adios a las fotos borrosas y dale un toque especial ","https://home.ripley.com.pe/Attachment/WOP_5/2065252024462/2065252024462_2.jpg"))

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.setLayoutManager(LinearLayoutManager(view.context))
        recyclerView!!.setAdapter(RvAdapter(dataList,view.context))
        return view
    }
}