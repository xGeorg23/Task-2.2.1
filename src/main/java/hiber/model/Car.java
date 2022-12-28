package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;
    public Car() {
    }
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    public long getId() {
        return id;
    }
    public String getModel() {
        return model;
    }
    public int getSeries() {
        return series;
    }
    @Override
    public String toString() {
        return "ID " + getId() + " Model " + getModel() + " Series " + getSeries();
    }

}

