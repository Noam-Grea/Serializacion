package serializationandfilehandler;
import java.io.*;

public class Profesor extends Person {
    private static final long serialVersionUID = 3L;
    private String especialidad;

    public Profesor(String name, int age, String address, String especialidad) {
        super(name, age, address);
        this.especialidad = especialidad;
    }

    public Profesor() {
        super();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}