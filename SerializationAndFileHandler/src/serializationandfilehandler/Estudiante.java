package serializationandfilehandler;
import java.io.*;

public class Estudiante extends Person {
    private static final long serialVersionUID = 2L;
    private String carrera;

    public Estudiante(String name, int age, String address, String carrera) {
        super(name, age, address);
        this.carrera = carrera;
    }

    public Estudiante() {
        super();
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}