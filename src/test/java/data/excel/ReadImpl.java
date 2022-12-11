package data.excel;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ReadImpl {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream= new FileInputStream(System.getProperty("user.dir")+"/Excel.xlsx");
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet= xssfWorkbook.getSheet("Movie");
        Iterator<Row> rows=xssfSheet.iterator();

        int rowsize=0;

        List columnList= new ArrayList();

        Row row=rows.next();
        Iterator<Cell> cellvalues=row.cellIterator();
        int totalcolumns=0;
        while (cellvalues.hasNext()){
            columnList.add(cellvalues.next().getStringCellValue());
          //  columnSet.add(cellvalues.next().getStringCellValue());
            totalcolumns++;
            //System.out.println(cellvalues.next().toString());

        }
        System.out.println(columnList);
        Set columnSet= new HashSet(columnList);
        System.out.println(columnSet);
        System.out.println(totalcolumns);

        Iterator iterator= columnList.iterator();
        int  columnsize=0;
        while (iterator.hasNext()){
            columnsize++;
            if (iterator.next().toString().equalsIgnoreCase("FilmName")){
                break;
            }
        }
        System.out.println("Hero column size is:"+columnsize);


while (rows.hasNext()){
    Row row1= rows.next();
    switch (row1.getCell(columnsize-1).getCellType())
    {
        case  BOOLEAN:
            System.out.println(row1.getCell(columnsize-1).getBooleanCellValue());
            break;
        case STRING:
            System.out.println(row1.getCell(columnsize-1).getStringCellValue());
            break;
        case NUMERIC:
            System.out.println(row1.getCell(columnsize-1).getNumericCellValue());
            break;

    }
   // System.out.println(row1.getCell(columnsize-1).getStringCellValue());
}

        /*while (rows.hasNext()){
            Row rowa=rows.next();
            rowsize++;
            Iterator<Cell> cellIterator= rowa.cellIterator();
            totalcolumns++;
            while (cellIterator.hasNext()){

                Cell value= cellIterator.next();
                if (value.getStringCellValue().equalsIgnoreCase("Artists")){

                    int column= value.getColumnIndex();
                    System.out.println(column);
                    break;
                }
                System.out.println(value);
            }
            //System.out.println(rows.next());

        }
        System.out.println("Total no of columns in the excel is:"+totalcolumns);
        System.out.println("Total Rows in excel is:"+rowsize);
*/

    }
}
