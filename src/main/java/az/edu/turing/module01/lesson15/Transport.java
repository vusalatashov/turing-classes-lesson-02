package az.edu.turing.module01.lesson15;

import java.util.Objects;

public abstract class Transport {
    private String transportName;
    private String type;

    public Transport(String transportName, String type) {
        this.transportName = transportName;
        this.type = type;
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public abstract void transport();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(transportName, transport.transportName) && Objects.equals(type, transport.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportName, type);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transportName='" + transportName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
