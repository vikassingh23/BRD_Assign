package com.nucleus.makerchecker.controller.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.makerchecker.connectionfac.ConnectionFactory;

public class ActiveRec extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection =  ConnectionFactory.getConnection();
		System.out.println("in the actice rec servlet**********************");
		String[] selectedItems = request.getParameterValues("selectedItems");
		System.out.println(selectedItems.length);
		for (String selectedItem : selectedItems) {
		    System.out.println(selectedItem);
		}
		
		/*try {
            PreparedStatement ps = connection
                    .prepareStatement("update CustomerBRDMaker  set customerName=?, customerAddr1=?, customerAddr2=?, customerPin =?,"
                    		+ " email=?, contactNo =?, primaryContactPerson =?, activeInactive=?, modifiedDate=?, recordStatus=?" +
                            "where customerCode=?");
    		ps.setString(1, customer.getCustomer_name());
    		ps.setString(2, customer.getCustomer_add1());
    		ps.setString(3,customer.getCustomer_add2());
    		ps.setInt(4, customer.getPincode());
    		ps.setString(5, customer.getEmail());
    		ps.setLong(6, customer.getCustomer_contactno());
    		ps.setString(7, customer.getPrimary_contact());
    		ps.setString(8, customer.getAiflag());
    		ps.setString(9, customer.getModifydate());
    		ps.setString(10, customer.getRecord_status());
    		ps.setString(11, customer.getCustomer_code());
    		ps.executeUpdate();
    		
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
		
	}

}
