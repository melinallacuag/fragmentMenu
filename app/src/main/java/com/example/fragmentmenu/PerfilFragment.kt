package com.example.fragmentmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_perfil.*


class PerfilFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cardsTienda.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_perfilFragment_to_tiendaFragment)
        }

        cardsGrifo.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_perfilFragment_to_grifoFragment)
        }



    }
}