package P1_Clase_mutable_inmutable;

public class Passenger {

    private String name;
    private String lastname;
    private String idPassenger;
    private String email;

    public Passenger(String name, String lastname, String idPassenger, String email) {
        this.name = name;
        this.lastname = lastname;
        this.idPassenger = idPassenger;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getIdPassenger() {
        return idPassenger;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", idPassenger='" + idPassenger + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
