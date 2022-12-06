package com.example.fragmentmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_detalle_op_factura.*
import kotlinx.android.synthetic.main.fragment_factura.*


class DetalleOpFacturaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalle_op_factura, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btneliminar.setOnClickListener{
            val showeliminar = EliminarOpFacturaFragment()
            showeliminar.show((activity as AppCompatActivity).supportFragmentManager,"shop")

        }

        btneditar.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_detalleOpFacturaFragment_to_editarOpFacturaFragment)
        }

    }

}