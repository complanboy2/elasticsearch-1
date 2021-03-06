package com.castlighthealth.epd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provider_locations")
public class ProviderLocation {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="state")
    private String state;

    @Column(name="latitude")
    private float lat;

    @Column(name="longitude")
    private float lon;

    public String getState() {
        return state;
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }
}
