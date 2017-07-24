package c02;

import c02.superclass.Observer;
import c02.superclass.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Administrator on 2017/7/22.
 */
public class WeatherData2 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData2(){

    }


    @Override
    public void notifyObservers() {

    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

















