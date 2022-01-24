package com.example.edakitari.ui.services

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.edakitari.R

import com.example.edakitari.models.Service

//implement recycler adapter view
class ServicesAdapter(val context: Context, var serviceList: ArrayList<Service>): RecyclerView.Adapter<ServicesAdapter.ServiceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServiceViewHolder {
//        do something here
        val serviceView = LayoutInflater.from(context).inflate(R.layout.single_service, parent, false)
        return ServiceViewHolder(serviceView)
    }

    override fun onBindViewHolder(serviceHolder: ServiceViewHolder, position: Int) {
        TODO("Not yet implemented")
//        do something here
        val service = serviceList[position]
        serviceHolder.setData(service, position)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return serviceList.size
    }

//    inner class here
    inner class ServiceViewHolder(serviceView: View) : RecyclerView.ViewHolder(serviceView) {
//        do something here
        private var currentPosition: Int = -1
        private var currentService: Service? = null
        fun setData(service: Service, position: Int) {
            this.currentPosition = position
            this.currentService = service
        }
    }
}