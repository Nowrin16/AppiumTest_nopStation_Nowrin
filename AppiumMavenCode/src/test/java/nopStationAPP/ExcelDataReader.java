package nopStationAPP;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataReader {
    public static Object[][] readExcelData(String filePath, String sheetName) {
        Object[][] data = null;

        try (XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(filePath))) {
            XSSFSheet sheet = wb.getSheet(sheetName);
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

            data = new Object[rowCount - 1][colCount];

            for (int i = 1; i < rowCount; i++) {
                for (int j = 0; j < colCount; j++) {
                    data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
