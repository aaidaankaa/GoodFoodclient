package com.beautyshop.goodfoodclient.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beautyshop.goodfoodclient.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class LocationFragment : Fragment(), OnMapReadyCallback {
    private var mMap: GoogleMap? = null

    companion object {
        fun newInstance() = LocationFragment()
    }

    private lateinit var viewModel: LocationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.location_fragment, container, false)
        val mapFragment =
           childFragmentManager.findFragmentById(R.id.mapView) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
        return view
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val UCA = LatLng(42.8664049, 74.5806414)
        //mMap!!.addMarker(MarkerOptions().position(UCA).title("YOUR TITLE"))!!.showInfoWindow()
        mMap!!.animateCamera(CameraUpdateFactory.newLatLngZoom(UCA, 12f))
        val itAcademy = LatLng(42.8743745,74.6201361)
        mMap!!.addMarker(MarkerOptions().position(itAcademy).title("Ибраимова 115"))!!.showInfoWindow()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LocationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}