package data.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class WriteImpl {

    public static void main(String[] args) throws IOException {

        String fileLocation=System.getProperty("user.dir")+"/Excel.xlsx";

        FileInputStream fileInputStream= new FileInputStream(fileLocation);
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet= xssfWorkbook.getSheet("Movie");
        Iterator<Row> rows=xssfSheet.iterator();
        String[] dataToWrite = {"Bimbisara","Kalyan Ram","Mallidi Vassishta","Samyuktha Menon","2022"};
        Row row = xssfSheet.getRow(0);
        int noofrows=xssfSheet.getLastRowNum()-xssfSheet.getFirstRowNum();
        System.out.println(noofrows);
        Row newRow=xssfSheet.createRow(noofrows+1);
        for(int j = 0; j < row.getLastCellNum(); j++){

            //Fill data in row

            Cell cell = newRow.createCell(j);

            cell.setCellValue(dataToWrite[j]);

        }
        fileInputStream.close();

        FileOutputStream fileOutputStream= new FileOutputStream(fileLocation);
        xssfWorkbook.write(fileOutputStream);
        fileOutputStream.close();
        xssfWorkbook.close();

    }
}
