package c02;

import c02.superclass.DisplayElement;
import c02.superclass.Observer;
import c02.superclass.Subject;

import java.util.Observable;

/**
 * Created by Administrator on 2017/7/22.
 */
public class CurrentConditionsDisplay2 implements java.util.Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof  WeatherData2){
            WeatherData2 weatherData2 = (WeatherData2)o;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }
}
