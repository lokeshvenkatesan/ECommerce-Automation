package testRead;

import java.io.File;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testTableWrite {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Admin\\TestSheet\\Book1.xlsx");

		Workbook workbook = new XSSFWorkbook();

		Sheet createSheet = workbook.createSheet("Sheet1");
		workbook.close();

	}
}
