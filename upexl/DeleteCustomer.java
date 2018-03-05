package com.nucleus.makerchecker.controller.servlets;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.util.CellUtil;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_MULTIPLYPeer;

public class DeleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String hdcode=request.getParameter("hd1");		
		System.out.println(hdcode);
		
		//response.setContentType("application/vnd.ms-excel");
		//HSSFWorkbook workbook = new HSSFWorkbook();
		
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=filename.xls");
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("sheet 1");
		HSSFCellStyle style = workbook.createCellStyle();
		HSSFFont font = workbook.createFont();
		font.setBold(true);
		style.setFont(font);
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[]{ "ID", "NAME", "LASTNAME" });
        data.put("2", new Object[]{ 1, "Pankaj", "Kumar" });
        data.put("3", new Object[]{ 2, "Prakashni", "Yadav" });
        data.put("4", new Object[]{ 3, "Ayan", "Mondal" });
        data.put("5", new Object[]{ 4, "Virat", "kohli" });
 
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("This is a test of merging");
        cell.setCellStyle(style);
        CellUtil.setAlignment(cell, HorizontalAlignment.CENTER);
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 4));
        
        // Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 1;
        for (String key : keyset) {
            // this creates a new row in the sheet
            row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                cell = row.createCell(cellnum++);
                if (obj instanceof String){
                    cell.setCellValue((String)obj);
                //cell.setCellStyle(style);
                }
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
		
		workbook.write(response.getOutputStream()); // Write workbook to response.
		workbook.close();
       
        
        
		//Code for writing xlsx
			/*	
			response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");		
			response.setHeader("Content-Disposition", "attachment; filename=filename.xlsx");		
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("sheet 1");			
			
			Map<String, Object[]> data = new TreeMap<String, Object[]>();
	        data.put("1", new Object[]{ "ID", "NAME", "LASTNAME" });
	        data.put("2", new Object[]{ 1, "Pankaj", "Kumar" });
	        data.put("3", new Object[]{ 2, "Prakashni", "Yadav" });
	        data.put("4", new Object[]{ 3, "Ayan", "Mondal" });
	        data.put("5", new Object[]{ 4, "Virat", "kohli" });
	 
	        // Iterate over data and write to sheet
	        Set<String> keyset = data.keySet();
	        int rownum = 0;
	        for (String key : keyset) {
	            // this creates a new row in the sheet
	            Row row = sheet.createRow(rownum++);
	            Object[] objArr = data.get(key);
	            int cellnum = 0;
	            for (Object obj : objArr) {
	                Cell cell = row.createCell(cellnum++);
	                if (obj instanceof String)
	                    cell.setCellValue((String)obj);
	                else if (obj instanceof Integer)
	                    cell.setCellValue((Integer)obj);
	            }
	        }
			
			workbook.write(response.getOutputStream()); // Write workbook to response.
			workbook.close();
			*/
				
				/*
				String custcode = request.getParameter("customer_code");
				System.out.println(custcode);
				CustomerDao customerDao = new CustomerDao();
				customerDao.deleteUser(custcode);
				
				response.sendRedirect("welcome.jsp");
				*/
			}
	

}
