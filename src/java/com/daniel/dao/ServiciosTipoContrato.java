package com.daniel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.daniel.util.DbUtil;
import static javafx.scene.input.KeyCode.T;

public class ServiciosTipoContrato {

    private Connection connection;

    public ServiciosTipoContrato() {
        connection = DbUtil.getConnection();
    }

    public void updateUser(int cedula, int sueldoBase) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update Tipo_Contrato set id_tipo=?, cc_Emple=?, sueldo_Base=?, aux_Trans=?, prima_Servi=?, cesantias=?,int_cesantias=?, vacaciones=? ,salud=?,pension=? ,sena=?,ICBF=?, caja_Compe=?, salario=?"
                            + "where cc_Emple=?");
            int auxt = 0;
            if (sueldoBase <= 1475434) {
                auxt = 83140;

            }
            
            int primaSer=(sueldoBase * 240)/360 ;
            int cesantias=(sueldoBase * 240)/360;
            int intCesantias=  (int) (cesantias*0.12);
            int vac= (sueldoBase * 240)/720 ;
            int salud=(int) (sueldoBase * 0.125);
            int pension= (int) (sueldoBase * 0.16);
            int sena=(int) (sueldoBase * 0.02);
            int icbf= (int) (sueldoBase *0.03);
            int cajaComp= (int) (sueldoBase * 0.04);
            
            int salarioFin= sueldoBase +auxt +primaSer+cesantias+intCesantias+vac -salud- pension-sena-icbf-cajaComp; 
            
            

// Parameters start with 1
            preparedStatement.setInt(1,1);
            preparedStatement.setInt(2,cedula);
            preparedStatement.setInt(3,sueldoBase);
            preparedStatement.setInt(4,auxt);
            preparedStatement.setInt(5,primaSer);
            preparedStatement.setInt(6,cesantias);
            preparedStatement.setInt(7,intCesantias);
            preparedStatement.setInt(8,vac);
            preparedStatement.setInt(9,salud);
            preparedStatement.setInt(10,pension);
            preparedStatement.setInt(11,sena);
            preparedStatement.setInt(12,icbf);
            preparedStatement.setInt(13,cajaComp);
            preparedStatement.setInt(14,salarioFin);
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
  public List<T> getAllUsers() {
		List<T> users = new ArrayList<User>();
		try {
                      System.out.println("LLegue hasta aca");
			Statement statement = connection.createStatement();
                        
                        
			ResultSet rs = statement.executeQuery("select * from Empleado,Tipo_Contrato where Empleado.cc_Emple= Tipo_Contrato.cc_Emple");
			while (rs.next()) {
				User user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));
				user.setDob(rs.getDate("dob"));
				user.setEmail(rs.getString("email"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}

}
