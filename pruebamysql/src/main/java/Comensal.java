
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mau
 */
public class Comensal {
    String nombre,usuario,correo,contraseña;
    ArrayList<Publicaciones> publicaciones;
    
    public Comensal(){
        
    }
    
    public Comensal(String nombre,String usuario,String correo,String contraseña){
        this.nombre=nombre;
        this.usuario=usuario;
        this.correo=correo;
        this.contraseña=contraseña;
    }
    
    public void addPublicacion(Publicaciones p){
        publicaciones.add(p);
    }
    
}
