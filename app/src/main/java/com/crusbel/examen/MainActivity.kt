package com.crusbel.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.crusbel.examen.adapters.PagerAdapter
import com.crusbel.examen.fragments.CelularFragment
import com.crusbel.examen.fragments.TelevisorFragment
import com.crusbel.examen.fragments.SonidoFragment
import com.crusbel.examen.fragments.LaptopFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var prevMenu: MenuItem? = null

    lateinit var tv:Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = mainBar as Toolbar
        tv.title = getString(R.string.celular)

        setPager(getPA())
        setNav()
    }

    private fun getPA():PagerAdapter{
        val adapter = PagerAdapter(supportFragmentManager)
        adapter.addFrag(CelularFragment())
        adapter.addFrag(LaptopFragment())
        adapter.addFrag(TelevisorFragment())
        adapter.addFrag(SonidoFragment())
        return adapter
    }

    private fun setPager(adapter:PagerAdapter){
        vPager.adapter = adapter
        vPager.offscreenPageLimit = adapter.count
        vPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
            //DESLIZAR
            override fun onPageSelected(position: Int) {
                prevMenu?.let { prevMenu!!.isChecked = false }
                        ?:run { nav.menu.getItem(0).isChecked = false }
                nav.menu.getItem(position).isChecked = true
                when(position){
                    0->tv.title = getString(R.string.celular)
                    1->tv.title = getString(R.string.laptop)
                    2->tv.title = getString(R.string.televisor)
                    3->tv.title = getString(R.string.sonido)
                }
                prevMenu = nav.menu.getItem(position)
            }
        })
    }

    //OPRIMIR BOTON
    private fun setNav(){
        nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menuCelular -> {
                    vPager.currentItem = 0
                    tv.title="Celular"
                    true
                }
                R.id.menuLaptop -> {
                    vPager.currentItem = 1
                    tv.title="Laptop"
                    true
                }
                R.id.menuTelevisor -> {
                    vPager.currentItem = 2
                    tv.title="Televisor"
                    true
                }
                R.id.menuSonido -> {
                    vPager.currentItem = 3
                    tv.title="Audio"
                    true
                }
                else -> false
            }
        }
    }
}