package test.java;

/*import com.google.common.collect.Table;
import com.sun.rowset.internal.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class dataDriven {

    public ArrayList<String> getData(String testcaseName) throws IOException, SQLException {

    }

    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub

    }

}
import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class DataDrivenMethod {
    private XSSFSheet ExcelWSheet;
    private XSSFWorkbook ExcelWBook;

    //Constructor to connect to the Excel with sheetname and Path
    public void Excelutils(String Path, String SheetName) throws Exception {

        try {
            // Open the Excel file
            FileInputStream ExcelFile = new FileInputStream(Path);

            // Access the required test data sheet
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
        } catch (Exception e) {
            throw (e);
        }
    }

    //This method is to set the rowcount of the excel.
    public int excel_get_rows() throws Exception {

        try {
            return ExcelWSheet.getPhysicalNumberOfRows();
        } catch (Exception e) {
            throw (e);
        }
    }

    //This method to get the data and get the value as strings.
    public String getCellDataasstring(int RowNum, int ColNum) throws Exception {

        try {
            String CellData =
                    ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
            System.out.println("The value of CellData " + CellData);
            return CellData;
        } catch (Exception e) {
            return "Errors in Getting Cell Data";
        }
    }

    //This method to get the data and get the value as number.
    public double getCellDataasnumber(int RowNum, int ColNum) throws Exception {

        try {
            double CellData =
                    ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
            System.out.println("The value of CellData " + CellData);
            return CellData;
        } catch (Exception e) {
            return 000.00;
        }
    }


}*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenMethod {

//Identify Testcases coloum by scanning the entire 1st row
//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
//after you grab purchase testcase row = pull all the data of that row and feed into test

    public ArrayList<String> getData(String testcaseName) throws IOException
    {
//fileInputStream argument
        ArrayList<String> a=new ArrayList<String>();

        FileInputStream fis=new FileInputStream("C://Users//Promit//Downloads//Test//Learn//DDD_Test_Data.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fis);

        int sheets=workbook.getNumberOfSheets();
        for(int i=0;i<sheets;i++)
        {
            if(workbook.getSheetName(i).equalsIgnoreCase("Test_Case_ID"))
            {
                XSSFSheet sheet=workbook.getSheetAt(i);
//Identify Testcases coloum by scanning the entire 1st row

                Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
                Row firstrow= rows.next();
                Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
                int k=0;
                int coloumn = 0;
                while(ce.hasNext())
                {
                    Cell value=ce.next();

                    if(value.getStringCellValue().equalsIgnoreCase("Test_Case_ID"))
                    {
                        coloumn=k;

                    }

                    k++;
                }
                System.out.println(coloumn);

////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
                while(rows.hasNext())
                {

                    Row r=rows.next();

                    if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName))
                    {

////after you grab purchase testcase row = pull all the data of that row and feed into test

                        Iterator<Cell>  cv=r.cellIterator();
                        while(cv.hasNext())
                        {
                            Cell c= cv.next();
                            if(c.getCellType()==CellType.STRING)
                            {

                                a.add(c.getStringCellValue());
                            }
                            else{

                                a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

                            }
                        }
                    }
                }

            }
        }
        return a;

    }


}





