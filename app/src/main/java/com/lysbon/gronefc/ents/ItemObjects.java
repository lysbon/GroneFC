package com.lysbon.gronefc.ents;

/**
 * Created by csosa on 05/11/2015.
 */
public class ItemObjects {
    private String name;
    private int photo;

    public ItemObjects(String name, int photo) {
        setName(name);
        setPhoto(photo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
