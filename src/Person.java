
public class Person {
    protected String name;
    protected String dni;
    protected String mail;

    public Person() {
        name="";
        dni="";
        mail="hola";
    }

    public Person(String name,String idCard) {
        this.name=name;
        this.dni=idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = "";
        this.dni = dni;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = "";
        this.mail = mail;
    }


    @Override
    public boolean equals(Object p) {
        return (this.dni.equals(((Person)p).dni));
    }

    @Override
    public String toString() {
        return name + " " + dni;
    }
}
