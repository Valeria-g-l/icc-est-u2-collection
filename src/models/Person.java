package models;

public class Person implements Comparable<Person> {
    private String nombre;
    private int edad;

    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    @Override
    public String toString() {
        return "Person [nombre=" + nombre + ", edad=" + edad + "]";
    }
    @Override
    public int compareTo(Person o) {
        int compN = this.nombre.compareTo(o.getNombre());
        if(compN != 0 )
             return compN;
        return Integer.compare(this.edad, o.getEdad());
        
    }
    
    

    
    
}
