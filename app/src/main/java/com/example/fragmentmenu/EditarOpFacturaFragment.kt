package com.example.fragmentmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_editar_op_factura.*
import kotlinx.android.synthetic.main.fragment_op_factura.*


class EditarOpFacturaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_editar_op_factura, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btneditarfactura.setOnClickListener{
            val showeditarfactura = EditarModalFacturaFragment()
            showeditarfactura.show((activity as AppCompatActivity).supportFragmentManager,"editar factura")

        }

        btneditargalones.setOnClickListener{
            val showeditargalones = EditarModalGalonesFragment()
            showeditargalones.show((activity as AppCompatActivity).supportFragmentManager,"editar galones")

        }

    }
}