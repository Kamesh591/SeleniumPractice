package data.excel;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderImpleme {

    DataFormatter dataFormatter= new DataFormatter();


    @DataProvider
    public  Object[][] readData() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/Excel.xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        int sheets = xssfWorkbook.getNumberOfSheets();
        XSSFSheet xssfSheet = xssfWorkbook.getSheet("Movie");
        int rowcount=xssfSheet.getPhysicalNumberOfRows();
        Row row= xssfSheet.getRow(0);
        int columnCount=row.getLastCellNum();
        Object[][] data=new Object[rowcount-1][columnCount];

        for (int i=0;i<rowcount-1;i++){
            row=xssfSheet.getRow(i+1);
            for (int j=0;j<columnCount;j++){
                data[i][j]=dataFormatter.formatCellValue(row.getCell(j));
              //  System.out.println(data[i][j]);
            }
            System.out.println("Outer loop completed");
        }

        return data;
    }

    @Test(dataProvider = "readData")
    public void test1(String filmName,String Hero, String Director, String Heroin, String age){

        System.out.println("Movie Name is:\t"+filmName+"\tHero Name:\t"+Hero+"\tDirector Name:"+Director+"\tHeroin name:"+Heroin+"\tAge is:"+age);


    }



}
