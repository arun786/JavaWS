package com.arun.readfileinjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAnExcelFileInJava {
	public static void main(String[] args) {
		readAnExcelFile("Product.xlsx");
	}

	public static void readAnExcelFile(String fileName) {

		ClassLoader loader = ReadAnExcelFileInJava.class.getClassLoader();
		FileInputStream fis = null;
		try {
			File file = new File(loader.getResource(fileName).getFile());
			fis = new FileInputStream(file);

			/* step 1 : create a workbook instance from excel file */
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			/*
			 * Step 2 : get the required sheet, in this case it is first sheet
			 */
			XSSFSheet sheet = workbook.getSheetAt(0);

			/* Step 3 : iterate the row */
			Iterator<Row> rowIterator = sheet.rowIterator();

			while (rowIterator.hasNext()) {
				// Step 4 : get the Row
				Row row = rowIterator.next();

				// Step 5 : Iterator the Row
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {

					// Step 6 : Iterator the Cell
					Cell cell = cellIterator.next();

					switch (cell.getCellType()) {

					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						break;

					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					}
				}
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
