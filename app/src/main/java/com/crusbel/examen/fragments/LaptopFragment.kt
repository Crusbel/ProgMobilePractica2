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


class LaptopFragment : Fragment() {

    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_laptop, container, false)
        val dataList = ArrayList<Model>()
        dataList.add(Model("Laptop Lenovo 14", 2000.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://home.ripley.com.pe/Attachment/WOP_5/2004245941980/2004245941980_2.jpg"))
        dataList.add(Model("Laptop Lenovo 16", 4000.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://home.ripley.com.pe/Attachment/WOP_5/2004227989276/2004227989276_2.jpg"))
        dataList.add(Model("Laptop HP 16", 2500.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://home.ripley.com.pe/Attachment/WOP_5/2004248944872/2004248944872-3.jpg"))
        dataList.add(Model("Laptop Asus 16", 3500.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://home.ripley.com.pe/Attachment/WOP_5/2004235820813/2004235820813_2.jpg"))
        dataList.add(Model("Laptop HP 14", 1300.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://svcimg.ripley.com.pe/2020/02/21135234/OV1831.jpg"))
        dataList.add(Model("Laptop Lenovo 16", 2700.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://home.ripley.com.pe/Attachment/WOP_5/2004245884294/2004245884294_2.jpg"))
        dataList.add(Model("Laptop Omen 16", 3500.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://home.ripley.com.pe/Attachment/WOP_5/2004210686847/2004210686847-1.jpg"))
        dataList.add(Model("Laptop Asus 16", 2800.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://home.ripley.com.pe/Attachment/WOP_5/2004251779041/2004251779041-1.jpg"))
        dataList.add(Model("Laptop LG 16", 2500.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://home.ripley.com.pe/Attachment/WOP_5/2004214933848/2004214933848_2.jpg"))
        dataList.add(Model("Laptop Acer 16", 4500.0,"Una laptop sobresaliente en todo sentido. El modelo 15-dy1004la de HP cuenta con un poderoso procesador Intel Core i5 de décima generación RAM de 8GB","https://home.ripley.com.pe/Attachment/WOP_5/2004212619348/2004212619348_2.jpg"))

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.setLayoutManager(LinearLayoutManager(view.context))
        recyclerView!!.setAdapter(RvAdapter(dataList,view.context))
        return view
    }
}