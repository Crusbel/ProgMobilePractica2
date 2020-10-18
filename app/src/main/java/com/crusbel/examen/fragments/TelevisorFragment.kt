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


class TelevisorFragment : Fragment() {

    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_televisor, container, false)
        val dataList = ArrayList<Model>()
        dataList.add(Model("LG UHD 49", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://home.ripley.com.pe/Attachment/WOP_5/2018228739587/2018228739587_2.jpg"))
        dataList.add(Model("SAMSUNG SMART 4K", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://svcimg.ripley.com.pe/2019/11/15171106/50nu7095.jpg"))
        dataList.add(Model("DAEWOO SMART 32", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://home.ripley.com.pe/Attachment/WOP_5/2018249100861/2018249100861_2.jpg"))
        dataList.add(Model("LG SMART TV 49", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://home.ripley.com.pe/Attachment/WOP_5/2018224049819/2018224049819_2.jpg"))
        dataList.add(Model("AOC SMART TV 32", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://home.ripley.com.pe/Attachment/WOP_5/2018237576050/2018237576050_2.jpg"))
        dataList.add(Model("TLC SMART TV 4K", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://home.ripley.com.pe/Attachment/WOP_5/2018249875257/2018249875257_2.jpg"))
        dataList.add(Model("SONY TV LED 55", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://home.ripley.com.pe/Attachment/WOP_5/2018210675039/2018210675039_2.jpg"))
        dataList.add(Model("HISENSE SMART TV 50", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://home.ripley.com.pe/Attachment/WOP_5/2018248261501/2018248261501_2.jpg"))
        dataList.add(Model("AOC SMART TV 55", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://home.ripley.com.pe/Attachment/WOP_5/2018240160345/2018240160345_2.jpg"))
        dataList.add(Model("AOC SMART TV 43", 2000.0,"Experimenta momentos llenos de emoción suspenso terror comedia y más con este moderno televisor HD que cuenta con la mejor tecnología","https://home.ripley.com.pe/Attachment/WOP_5/2018237576067/2018237576067_2.jpg"))

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.setLayoutManager(LinearLayoutManager(view.context))
        recyclerView!!.setAdapter(RvAdapter(dataList,view.context))
        return view
    }
}