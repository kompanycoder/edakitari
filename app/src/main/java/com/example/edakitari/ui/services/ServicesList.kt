package com.example.edakitari.ui.services

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.edakitari.R
import com.example.edakitari.models.generalServices

class ServicesList : Fragment() {

    override fun onCreateView( inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.list_services, parent, false)
        setupRecyclerView(view)
        return view
    }
    private fun setupRecyclerView(view: View?) {
        val context = requireContext()
        val serviceAdapter = ServicesAdapter(context, generalServices.listedServices!!)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.services_recycler_view)
        recyclerView?.adapter = serviceAdapter
        recyclerView?.setHasFixedSize(true)

//        layout Manager
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = RecyclerView.VERTICAL
        recyclerView?.layoutManager = layoutManager

    }
}