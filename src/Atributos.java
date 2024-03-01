
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aeaya
 */
public class Atributos {
    //usuarios
    private String apellidoU, nombreU, correo, nuevoapellidoU, nuevonombreU,nuevocorreo;
    private int edad, idUsuario, idBuscada, nuevaedad,idBuscadaEquipo;
    
    
    //equipos
    private String nombre_equipo, descripcion, nuevonombre_equipo, nuevadescripcion;
    private int idEquipo;
    
    
    //equipamiento
    private String nombre_equipamiento, tipo, nuevonombre_equipamiento, nuevotipo;
    private int idEquipamiento, idBuscadaEquipamiento;
    
    //partida
    private int idPartida, idBuscadaPartida;
    private Date fechainicio, nuevafecha;
    
    private String lugar, horainicio, abreviatura, nuevolugar, nuevahora,nuevaabreviatura;
    
    
    
    public Atributos(){
   ////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
   nombreU=null; correo= null; idUsuario=0;edad=0;apellidoU=null;
   nuevaedad=0;nuevoapellidoU=null; nuevonombreU=null;nuevocorreo=null;
   
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
   nombre_equipo=null; descripcion=null;idEquipo=0; idBuscadaEquipo=0;nuevonombre_equipo=null; nuevadescripcion=null;
   
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
   nombre_equipamiento=null; tipo=null; nuevonombre_equipamiento=null; nuevotipo=null;idEquipamiento=0;idBuscadaEquipamiento=0;
   
   ///////////////////////////////////////////////////////////////////////////////////////////////////
   
   idPartida=0;  fechainicio=null; nuevafecha=null; lugar=null; horainicio=null; abreviatura=null; nuevolugar=null; nuevahora=null;nuevaabreviatura=null;
   idBuscadaPartida=0;
}
    
     public void setIdPartida(int x){   
   idPartida = x;
   }
   public int getIdPartida(){
      return idPartida;
   } 
   
    public void setIdBuscadaPartida(int x){   
   idBuscadaPartida = x;
   }
   public int getIdBuscadaPartida(){
      return idBuscadaPartida;
   } 
    
    public void setFechaInicio(Date x){
      fechainicio = x;
   }
   public Date getFechaInicio(){
      return fechainicio;
   }
   
   public void setNuevaFecha(Date x){
      nuevafecha = x;
   }
   public Date getNuevaFecha(){
      return nuevafecha;
   }
    
   
   public void setLugar(String x){
      lugar= x;
   }
   public String getLugar(){
      return lugar;
   }
   
   public void setNuevoLugar(String x){
      nuevolugar= x;
   }
   public String getNuevoLugar(){
      return nuevolugar;
   }
   
   public void setNuevaAbreviatura(String x){
      nuevaabreviatura= x;
   }
   public String getNuevaAbreviatura(){
      return nuevaabreviatura;
   }
   
   public void setAbreviatura(String x){
      abreviatura= x;
   }
   public String getAbreviatura(){
      return abreviatura;
   }
   
   public void setNuevaHora(String x){
      nuevahora= x;
   }
   public String getNuevaHora(){
      return nuevahora;
   }
   
   public void setHora(String x){
      horainicio= x;
   }
   public String getHora(){
      return horainicio;
   }
    
   
    
    
    
    
    
    public void setIdEquipamiento(int x){   
   idEquipamiento = x;
   }
   public int getIdEquipamiento(){
      return idEquipamiento;
   }   
   
   public void setIdBuscadaEquipamiento(int x){   
   idBuscadaEquipamiento = x;
   }
   public int getIdBuscadaEquipamiento(){
      return idBuscadaEquipamiento;
   } 
   
    public void setNuevoNombreEquipamiento(String x){
      nuevonombre_equipamiento= x;
   }
   public String getNuevoNombreEquipamiento(){
      return nuevonombre_equipamiento;
   }
   
   public void setNuevoTipo(String x){
      nuevotipo= x;
   }
   public String getNuevoTipo(){
      return nuevotipo;
   }
   
    public void setNombreEquipamiento(String x){
      nombre_equipamiento= x;
   }
   public String getNombreEquipamiento(){
      return nombre_equipamiento;
   }
   
   public void setTipo(String x){
      tipo= x;
   }
   public String getTipo(){
      return tipo;
   }
    /////////////////////////////////////////////////////////////////////////////////////////////////// 
    public void setNombreU(String x){
      nombreU= x;
   }
   public String getNombreU(){
      return nombreU;
   }
   
   public void setApellidoU(String x){
      apellidoU= x;
   }
   public String getApellidoU(){
      return apellidoU;
   }
   
   public String getCorreo(){
      return correo;
   }
   
   public void setCorreo(String x){
      correo = x;
   }
   
   public void setIdUsuario(int x){   
   idUsuario = x;
   }
   public int getIdUsuario(){
      return idUsuario;
   }   
   
   public void setIdBuscada(int x){   
   idBuscada = x;
   }
   public int getIdBuscada(){
      return idBuscada;
   }   
   
   public void setEdad(int x){
      edad = x;
   }  
   public int getEdad(){
      return edad;
   }
   
    public void setNuevoNombreU(String x){
      nuevonombreU= x;
   }
   public String getNuevoNombreU(){
      return nuevonombreU;
   }
   
   public void setNuevoApellidoU(String x){
     nuevoapellidoU= x;
   }
   public String getNuevoApellidoU(){
      return nuevoapellidoU;
   }
   
   public String getNuevoCorreo(){
      return nuevocorreo;
   }
   
   public void setNuevoCorreo(String x){
      nuevocorreo = x;
   }
   
   public void setNuevaEdad(int x){
      nuevaedad = x;
   }  
   public int getNuevaEdad(){
      return nuevaedad;
   }
       /////////////////////////////////////////////////////////////////////////////////////////////////// 

    public void setNombreEquipo(String x){
      nombre_equipo= x;
   }
   public String getNombreEquipo(){
      return nombre_equipo;
   }
   
    public void setIdEquipo(int x){
      idEquipo= x;
   }
   public int getIdEquipo(){
      return idEquipo;
   }
   
    public void setDescripcion(String x){
     descripcion= x;
   }
   public String getDescripcion(){
      return descripcion;
   }
   
   public void setIdBuscadaEquipo(int x){   
   idBuscadaEquipo = x;
   }
   public int getIdBuscadaEquipo(){
      return idBuscadaEquipo;
   }   
   
   public void setNuevaDescripcion(String x){
     nuevadescripcion= x;
   }
   public String getNuevaDescripcion(){
      return nuevadescripcion;
   }
   
   public void setNuevoNombreEquipo(String x){
      nuevonombre_equipo= x;
   }
   public String getNuevoNombreEquipo(){
      return nuevonombre_equipo;
   }
}
