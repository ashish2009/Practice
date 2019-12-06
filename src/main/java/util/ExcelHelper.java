package util;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelHelper {

    XSSFWorkbook workbook = null;
    XSSFSheet sheet = null;
    XSSFRow row = null;
    XSSFCell cell = null;

    public ExcelHelper(String path){
        try {
            workbook = new XSSFWorkbook(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getCellData(String sheetName,String col,int rowNum){
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNum);
    }
}
