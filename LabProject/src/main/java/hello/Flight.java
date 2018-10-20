package hello;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {
    
    private int time;
    
    // array fields
    private String icao24;
    private String callsign;
    private String origin_country;
    private int time_position;
    private int last_contact;
    private float longitude;
    private float latitude;
    private float baro_altitude;
    private boolean on_ground;
    private float velocity;
    private float true_track;
    private float vertical_rate;
    private int[] sensors;
    private float geo_altitude;
    private String squawk;
    private boolean spi;
    private int position_source;
    
    /* Constructor */
    
    public Flight(){}
    

    /* Getters and Setters */
    
    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getIcao24() {
        return this.icao24;
    }

    public void setIcao24(String icao24) {
        this.icao24 = icao24;
    }

    public String getCallsign() {
        return this.callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getOrigin_country() {
        return this.origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public int getTime_position() {
        return this.time_position;
    }

    public void setTime_position(int time_position) {
        this.time_position = time_position;
    }

    public int getLast_contact() {
        return this.last_contact;
    }

    public void setLast_contact(int last_contact) {
        this.last_contact = last_contact;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getBaro_altitude() {
        return this.baro_altitude;
    }

    public void setBaro_altitude(float baro_altitude) {
        this.baro_altitude = baro_altitude;
    }

    public boolean isOn_ground() {
        return this.on_ground;
    }

    public void setOn_ground(boolean on_ground) {
        this.on_ground = on_ground;
    }

    public float getVelocity() {
        return this.velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getTrue_track() {
        return this.true_track;
    }

    public void setTrue_track(float true_track) {
        this.true_track = true_track;
    }

    public float getVertical_rate() {
        return this.vertical_rate;
    }

    public void setVertical_rate(float vertical_rate) {
        this.vertical_rate = vertical_rate;
    }

    public int[] getSensors() {
        return this.sensors;
    }

    public void setSensors(int[] sensors) {
        this.sensors = sensors;
    }

    public float getGeo_altitude() {
        return this.geo_altitude;
    }

    public void setGeo_altitude(float geo_altitude) {
        this.geo_altitude = geo_altitude;
    }

    public String getSquawk() {
        return this.squawk;
    }

    public void setSquawk(String squawk) {
        this.squawk = squawk;
    }

    public boolean isSpi() {
        return this.spi;
    }

    public void setSpi(boolean spi) {
        this.spi = spi;
    }

    public int getPosition_source() {
        return this.position_source;
    }

    public void setPosition_source(int position_source) {
        this.position_source = position_source;
    }

    @Override
    public String toString() {
        return "{" + 
                    "time:" + time + 
                    ",states: [" + 
                        "[" +
                            icao24 + ", " + 
                            callsign + ", " + 
                            origin_country + ", " + 
                            time_position + ", " + 
                            last_contact + ", " + 
                            longitude + ", " + 
                            latitude + ", " + 
                            baro_altitude + ", " + 
                            on_ground + ", " + 
                            velocity + ", " + 
                            true_track + ", " + 
                            vertical_rate + ", " + 
                            Arrays.toString(sensors) + ", " + 
                            geo_altitude + ", " + 
                            squawk + ", " + 
                            spi + ", " + 
                            position_source + 
                        "]" + 
                    "}" +
                '}';
    }
}
