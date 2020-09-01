package Step_Definition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteXLS {
	
      public FileInputStream fis = null;
      public XSSFWorkbook workbook = null;
      public XSSFSheet sheet = null;
      public XSSFRow row = null;
      public XSSFCell cell = null;
// 
//    public ReadWriteXLS(String xlFilePath) throws Exception
//    {
//        fis = new FileInputStream(xlFilePath);
//        workbook = new XSSFWorkbook(fis);
//        fis.close();
//    }
 
    public String getCellData(String xlFilePath, String sheetName, String colName, int rowNum) throws Throwable {
    	
    	int col_Num = -1;
    	
    	//Create an object of File class to open xlsx file

      //  File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

    	fis = new FileInputStream(xlFilePath);

      

        //Find the file extension by splitting file name in substring  and getting only extension name

        String fileExtensionName = xlFilePath.substring(xlFilePath.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class

        	workbook = new XSSFWorkbook(fis);

        }

        //Check condition if the file is xls file

//        else if(fileExtensionName.equals(".xls")){
//
//            //If it is xls file then create object of HSSFWorkbook class
//
//            workbook = new HSSFWorkbook(fis);
//
//        }

        //Read sheet inside the workbook by its name

        sheet = workbook.getSheet(sheetName);

        //Find number of rows in excel file

        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

        //Create a loop over all the rows of excel file to read it

        for (int i = 0; i < rowCount+1; i++) {

            Row row = sheet.getRow(i);

            //Create a loop to print cell values in a row

            for (int j = 0; j < row.getLastCellNum(); j++) {

                //Print Excel data in console

                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
                if(row.getCell(j).getStringCellValue().trim().equals(colName.trim()))
                col_Num = i;

            }

           
        } 

             
            row = sheet.getRow(rowNum - 1);
            cell = row.getCell(col_Num);
 
            if(cell.getCellType() == CellType.STRING)
                return cell.getStringCellValue();
            else if(cell.getCellType() == CellType.NUMERIC)
            {
                String cellValue = String.valueOf(cell.getNumericCellValue());
                return cellValue;
            }else if(cell.getCellType() == CellType.BLANK)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        }
       
    }


	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

