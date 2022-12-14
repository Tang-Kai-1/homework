package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {

    private String batteryParameter;

    public Laptop(String processor, String ram, String graphicsCard, String company, String model, String batteryParameter) {
        super(processor, ram, graphicsCard, company, model);
        this.batteryParameter = batteryParameter;
    }

    public String getBatteryParameter() {
        return batteryParameter;
    }

    public void setBatteryParameter(String batteryParameter) {
        this.batteryParameter = batteryParameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batteryParameter.equals(laptop.batteryParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryParameter);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                "batteryParameter='" + batteryParameter + '\'' +
                '}';
    }
}
