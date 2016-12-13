package com.arun.writeFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteAnExcelFile {

	public static void main(String[] args) {
		writeToAnExcelFile();
		System.out.println("File Written successfully");
		

	}

	public static void writeToAnExcelFile() {

		/* Step 1 : Create a workbook */
		XSSFWorkbook workbook = new XSSFWorkbook();

		/* Step 2 : Create a Sheet */
		XSSFSheet sheet = workbook.createSheet("product");

		/* Step 3 : Create Data to be put */
		Map<String, String[]> data = new TreeMap<String, String[]>();
		data.put("1", new String[] { "ID", "Product", "Name" });
		data.put("2", new String[] { "P001", "SOAP", "DOVE" });
		data.put("3", new String[] { "P002", "SOAP", "LIRIL" });
		int rowcount = 0;
		
		for (String key : data.keySet()) {
			int cellcount = 0;
			// Step 4 : Create rows
			Row row = sheet.createRow(rowcount++);

			String[] celldata = data.get(key);
			for (String value : celldata) {

				/* Step 5 : create cells and write the values */
				Cell cell = row.createCell(cellcount++);
				cell.setCellValue(value);
			}
		}

		File file = new File("ProductNew.xlsx");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			workbook.write(fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
