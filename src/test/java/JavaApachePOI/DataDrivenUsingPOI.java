package JavaApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;








public class DataDrivenUsingPOI {
	public void readExcel() throws IOException{
		FileInputStream excel = new FileInputStream("D:\\Selenium\\Book1.xls");
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		Sheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.iterator();

		while(rowIterator.hasNext()) {
			Row rowValue =	rowIterator.next();
			Iterator<Cell> columnIterator =	rowValue.iterator();

			while(columnIterator.hasNext()) {
				Cell cellValue =  columnIterator.next();
				System.out.println(cellValue);

			}
		}



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
}
