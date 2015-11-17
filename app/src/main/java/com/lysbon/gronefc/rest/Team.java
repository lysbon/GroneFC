package com.lysbon.gronefc.rest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by csosa on 10/11/2015.
 */
public class Team implements Parcelable{

    private String teamname;
    private String email;
    private String fullname;
    private String country;
    private String city;
    private String sport;
    private String radioUrl;
    private String videoUrl;
    private String facebookId;
    private String twitterId;
    private String locations;

    public Team(Parcel in) {
        teamname    = in.readString();
        email       = in.readString();
        fullname    = in.readString();
        country     = in.readString();
        city        = in.readString();
        sport       = in.readString();
        radioUrl    = in.readString();
        videoUrl    = in.readString();
        facebookId  = in.readString();
        twitterId   = in.readString();
        locations   = in.readString();
    }


    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getRadioUrl() {
        return radioUrl;
    }

    public void setRadioUrl(String radioUrl) {
        this.radioUrl = radioUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(teamname);
        dest.writeString(email);
        dest.writeString(fullname);
        dest.writeString(country);
        dest.writeString(city);
        dest.writeString(sport);
        dest.writeString(radioUrl);
        dest.writeString(videoUrl);
        dest.writeString(facebookId);
        dest.writeString(twitterId);
        dest.writeString(locations);
    }

    public static final Parcelable.Creator<Team> CREATOR
            = new Parcelable.Creator<Team>() {
        public Team createFromParcel(Parcel in) {
            return new Team(in);
        }

        public Team[] newArray(int size) {
            return new Team[size];
        }
    };

}
