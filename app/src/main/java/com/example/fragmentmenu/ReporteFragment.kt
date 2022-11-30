package com.example.fragmentmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_perfil.*
import kotlinx.android.synthetic.main.fragment_reporte.*


class ReporteFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reporte, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ReportcardsGrifo.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_reporteFragment_to_grifoFragment)
        }
        ReportcardsHome.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_reporteFragment_to_mainFragment)
        }
        ReportcardsUsuario.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_reporteFragment_to_perfilFragment)
        }
        ReportcardsTienda.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_reporteFragment_to_tiendaFragment)
        }

    }
}