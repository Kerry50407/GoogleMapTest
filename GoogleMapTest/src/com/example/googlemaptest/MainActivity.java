package com.example.googlemaptest;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends Activity {

	static final LatLng UT_TAIPEI = new LatLng(25.114076, 121.537025);
	private GoogleMap map;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		Marker nkut = map.addMarker(new MarkerOptions().position(UT_TAIPEI).title("如來正法班").snippet("台北市立大學 - 天母詩欣館"));
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(UT_TAIPEI, 16));
		
	}
}
