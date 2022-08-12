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
        val torro = LatLng( 42.8787015,74.6149038)
        mMap!!.addMarker(MarkerOptions().position(torro).title("ул.Шопокова 93, Torro"))!!.showInfoWindow()

        val pechkiLavochkiSemeynyyRestoran = LatLng(42.8744506,74.615708)
        mMap!!.addMarker(MarkerOptions().position(pechkiLavochkiSemeynyyRestoran).title(" ул.Киевская 1, Печки-Лавочки Семейный ресторан,"))!!.showInfoWindow()

        val skyBakuRestoBar = LatLng(42.8741692, 74.6120975)
        mMap!!.addMarker(MarkerOptions().position(skyBakuRestoBar).title("ул. Киевская 62, Sky Baku Resto Bar"))!!.showInfoWindow()

        val cafeBarLesnoy = LatLng(42.8719491, 74.6165273)
        mMap!!.addMarker(MarkerOptions().position(cafeBarLesnoy).title("ул.Султана Ибраимова 70 , Кафе Бар Лесной"))!!.showInfoWindow()

        val resto = LatLng(42.8773193, 74.623001)
        mMap!!.addMarker(MarkerOptions().position(resto).title(" Суюмбаева 142 , Ресто"))!!.showInfoWindow()

        val cafeDeParis = LatLng(42.8715792, 74.6206909)
        mMap!!.addMarker(MarkerOptions().position(cafeDeParis).title("Печки-Лавочки Семейный Ресторан,Ибраимова 115"))!!.showInfoWindow()

        val chateauWine = LatLng(42.8732754, 74.6192574)
        mMap!!.addMarker(MarkerOptions().position(chateauWine).title("улица Ибраимова 113 , Сhateau Wine"))!!.showInfoWindow()
        val sonCol = LatLng(42.8755329, 74.6075141)
        mMap!!.addMarker(MarkerOptions().position(sonCol).title("пр. Чуй, 110, Сон-Кол"))!!.showInfoWindow()

        val letoMarket = LatLng(42.8749577, 74.619202)
        mMap!!.addMarker(MarkerOptions().position(letoMarket).title("пр. Чуй 115, Лето Маркет"))!!.showInfoWindow()




    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LocationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}