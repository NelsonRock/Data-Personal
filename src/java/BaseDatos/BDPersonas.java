/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;
import java.sql.*;
import bbdd.*;
import Clases.*;

/**
 *
 * @author rcerrato
 */
public class BDPersonas {
        private static Statement s;
private static Connection c;
private static ResultSet registro;
public static String buscar(String n, BaseDatos BBDD)
	{
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
                        
            String cadena="SELECT * FROM Personas WHERE nombre='"+ n +"'";
                    
			registro =s.executeQuery(cadena);
			if(registro.next())
			{
				String ide=registro.getString(4);
                                s.close();
				return ide;
			}
			s.close();
			return "";
		}
		catch ( SQLException e)
		{	
			return null;
		}
	}
public static int getIde(String n, BaseDatos BBDD)
	{
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
                        
            String cadena="SELECT Id FROM Personas WHERE nombre='"+ n +"'";
                    
			registro =s.executeQuery(cadena);
			if(registro.next())
			{
				int ide=registro.getInt(1);
                                s.close();
				return ide;
			}
			s.close();
			return -1;
		}
		catch ( SQLException e)
		{	
			return -2;
		}
	}
    public static int altaBaja(String oper, Persona n, BaseDatos BBDD)
	{
            int ide=getIde(n.getNombre(), BBDD);
            String cadena="",borrar="", cadena1="SELECT * FROM Personas WHERE nombre='"+n.getNombre()+"' AND apellidos='"+n.getApellido()+"'";
            if(oper.equals("alta"))
               cadena="INSERT INTO Personas (nombre, apellidos, edad, sexo, estado_civil) VALUES ('"+n.getNombre()+"','"+n.getApellido()+"','"+n.getEdad()+"','"+n.getSexo()+"','"+n.getEstado()+"')";
            //if(oper.equals("actualizar"))
                //UPDATE alumno SET id_empresa='"+ i + "'WHERE dni='" + al.getDNI() +"'";
            if(oper.equals("baja")){
               cadena="DELETE FROM Personas WHERE nombre='"+n.getNombre()+"' AND apellidos='"+n.getApellido()+"'"+"";
               borrar="DELETE FROM Aficiones WHERE Persona="+ide;
            }
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
                        registro=s.executeQuery(cadena1);
                        if(registro.next() == false){
                            s.executeUpdate(cadena);
                            s.close();
                            return 1;
                        }
                         s.executeUpdate(borrar);
                         s.executeUpdate(cadena);
                         s.close();
                         return 0;
                 }
		catch ( SQLException e)
		{	
			return -2;
		}
	}
}
