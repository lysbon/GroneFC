package com.lysbon.gronefc;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.MarkerOptions;
import com.lysbon.gronefc.ents.PlaceDocument;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        PlaceDocument matute   = new PlaceDocument("Estadio Alejando Villanueva",-12.068573,-77.0230436,15);
        PlaceDocument tienda   = new PlaceDocument("Tienda Club Alianza Lima",-12.127888,-77.009166,15);
        PlaceDocument turrones = new PlaceDocument("Turrones Alianza Lima",-12.077886, -77.036617,15);
        mMap.addMarker(new MarkerOptions().position(matute.getPosition()).title(matute.getTitle()));
        mMap.addMarker(new MarkerOptions().position(tienda.getPosition()).title(tienda.getTitle()));
        mMap.addMarker(new MarkerOptions().position(turrones.getPosition()).title(turrones.getTitle()).snippet(turrones.getSnippet()));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(matute.getPosition(), matute.getZoom()));

    }
}
