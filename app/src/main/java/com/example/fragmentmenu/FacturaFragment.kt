package com.example.fragmentmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_factura.*


class FacturaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_factura, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnsoles.setOnClickListener{
            val showsoles = SolesFragment()
            showsoles.show((activity as AppCompatActivity).supportFragmentManager,"shop")

        }
        btngalones.setOnClickListener{
            val shogalones = GalonesFragment()
            shogalones.show((activity as AppCompatActivity).supportFragmentManager,"galones")

        }

        btnfactura.setOnClickListener{
            val shoopfactura = OpFacturaFragment()
            shoopfactura.show((activity as AppCompatActivity).supportFragmentManager,"factura")

        }
        btnboleta.setOnClickListener{
            val shoboleta = BoletaFragment()
            shoboleta.show((activity as AppCompatActivity).supportFragmentManager,"boleta")

        }
    }

}