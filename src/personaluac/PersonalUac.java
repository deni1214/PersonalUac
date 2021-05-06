/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaluac;

/**
 *
 * @author Denilson
 */
public class PersonalUac {
    private String Tipo;
    private String Nombre;
    private int edad;
    private char sexo;
    private int antiguedad;
    private int id;

    public PersonalUac() {
    }

    public PersonalUac(String Tipo, String Nombre, int edad, char sexo, int antiguedad, int id) {
        this.Tipo = Tipo;
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.antiguedad = antiguedad;
        this.id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PersonalUac{" + "Tipo=" + Tipo + ", Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + ", antiguedad=" + antiguedad + ", id=" + id + '}';
    }
   
    
    public static void main(String[] args) {
        
    }
    
}
