/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;
import bbdd.*;
import java.sql.*;
import Clases.*;

/**
 *
 * @author rcerrato
 */
public class BDDatos {
private static Statement s;
private static Connection c;
private static ResultSet registro;
public static int buscar(String n, BaseDatos BBDD)
	{
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
            String cadena="SELECT count(*) FROM Aficiones WHERE Aficion='"+ n +"'";//devuelve un fila con un campo entero.
                                    
			registro =s.executeQuery(cadena);
			if(registro.next())
			{
                            int cont=0;	
                            cont=registro.getInt(1);
                            s.close();
                            return cont;
			}
			s.close();
			return -1;
		}
		catch ( SQLException e)
		{	
			return -2;
		}
	}
}
