package com.lysbon.gronefc.ents;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by csosa on 05/11/2015.
 */
public class PlaceDocument {
    private String title;
    private String snippet;
    private LatLng position;
    private float  zoom;

    public PlaceDocument(){

    }
    public PlaceDocument(String pTitle,double pCoor1,double pCoor2, float pZoom){
        setTitle(pTitle);
        setPosition(new LatLng(pCoor1,pCoor2));
        setZoom(pZoom);
    }
    public PlaceDocument(String pTitle,double pCoor1,double pCoor2, float pZoom, String pSnippet){
        setTitle(pTitle);
        setPosition(new LatLng(pCoor1, pCoor2));
        setZoom(pZoom);
        setSnippet(pSnippet);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LatLng getPosition() {
        return position;
    }

    public void setPosition(LatLng position) {
        this.position = position;
    }

    public float getZoom() {
        return zoom;
    }

    public void setZoom(float zoom) {
        this.zoom = zoom;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }
}
