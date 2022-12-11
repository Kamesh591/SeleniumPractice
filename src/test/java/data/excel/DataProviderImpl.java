package data.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataProviderImpl {


    public Object[][] getDataFromExcel(String testcaseName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/Excel.xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        int sheets = xssfWorkbook.getNumberOfSheets();
        XSSFSheet xssfSheet = xssfWorkbook.getSheet("Movie");
        // Iterator<Row> rows=xssfSheet.iterator();
        Object[][] temp = new Object[0][];
        ArrayList<String> a = new ArrayList<String>();
        return temp;

      /*  for (int i = 0; i < sheets; i++) {
            if (xssfWorkbook.getSheetName(i).equalsIgnoreCase("testdata")) {
                XSSFSheet sheet = xssfWorkbook.getSheetAt(i);
//Identify Testcases coloum by scanning the entire 1st row

                Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
                Row firstrow = rows.next();
                Iterator<Cell> ce = firstrow.cellIterator();//row is collection of cells
                int k = 0;
                int coloumn = 0;
                while (ce.hasNext()) {
                    Cell value = ce.next();

                    if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
                        coloumn = k;

                    }

                    k++;
                }
                System.out.println(coloumn);

////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
                while (rows.hasNext()) {

                    Row r = rows.next();

                    if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)) {

////after you grab purchase testcase row = pull all the data of that row and feed into test

                        Iterator<Cell> cv = r.cellIterator();
                        while (cv.hasNext()) {
                            Cell c = cv.next();
                            if (c.getCellTypeEnum() == CellType.STRING) {

                                a.add(c.getStringCellValue());
                            } else {

                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

                            }
                        }
                    }


                }

            }
        }
*/
    }
}