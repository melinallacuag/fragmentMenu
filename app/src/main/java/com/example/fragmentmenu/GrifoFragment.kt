package com.example.fragmentmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_grifo.*
import kotlinx.android.synthetic.main.fragment_perfil.*


class GrifoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grifo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cardFacturacion.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_grifoFragment_to_facturaFragment)
        }

        cardCierrex.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_grifoFragment_to_cierrexFragment)
        }
        cardCierrez.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_grifoFragment_to_cierrezFragment22)
        }

        cardIniciodia.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_grifoFragment_to_inicioTurnoFragment)
        }
        cardCambioturno.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_grifoFragment_to_cierreTurnoFragment)
        }

        GrifocardsHome.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_grifoFragment_to_mainFragment)
        }
        GrifocardsUsuario.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_grifoFragment_to_perfilFragment)
        }
        GrifocardsReporte.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_grifoFragment_to_reporteFragment)
        }
        GrifocardsTienda.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_grifoFragment_to_tiendaFragment)
        }

    }
}