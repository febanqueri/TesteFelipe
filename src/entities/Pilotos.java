package entities;

import java.io.Serializable;

public class Pilotos implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private double hour;
    private String name;
    private int lap;
    private double timelap;
    private float speed;
    
    public Pilotos(){    
    }

    public Pilotos(double hour, String name, int lap, double timelap, float speed) {
        this.hour = hour;
        this.name = name;
        this.lap = lap;
        this.timelap = timelap;
        this.speed = speed;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    public double getTimelap() {
        return timelap;
    }

    public void setTimelap(double timelap) {
        this.timelap = timelap;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
    
    
}
