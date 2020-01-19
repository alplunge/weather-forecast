import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherEntry{

    //fields to be used from input files
    private Date when;
    private float pressure;
    private float humidity;

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public String toString(){
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
        return ("Data for: " + format.format(when)
            + " Barometric Pressure: " 
            + pressure
            + " Humidity: " + humidity);
    }
}