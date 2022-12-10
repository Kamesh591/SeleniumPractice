package data.excel;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadImpl {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream= new FileInputStream(System.getProperty("user.dir")+"/Excel.xlsx");
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet= xssfWorkbook.getSheet("Movie");
        Iterator<Row> rows=xssfSheet.iterator();

        while (rows.hasNext()){
            Row row=rows.next();
            Iterator<Cell> cellIterator= row.cellIterator();
            while (cellIterator.hasNext()){
                Cell value= cellIterator.next();
                System.out.println(value);
            }
            //System.out.println(rows.next());

        }


    }
}
