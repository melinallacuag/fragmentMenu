package com.example.fragmentmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardPerfil.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_perfilFragment)
        }
        cardTienda.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_tiendaFragment)
        }
        cardGrifo.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_grifoFragment)
        }
        cardReporte.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_reporteFragment)
        }
        cardSalir.setOnClickListener{
            val showsalir = SalirFragment()
            showsalir.show((activity as AppCompatActivity).supportFragmentManager,"shop")
        }

    }

}