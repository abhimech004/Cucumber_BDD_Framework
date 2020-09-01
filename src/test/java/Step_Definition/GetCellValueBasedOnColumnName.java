package Step_Definition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellValueBasedOnColumnName {

 public static String readdatafromExcelusingcolumnName(String filePath, String sheetName, String ColumnName, int RowNum)
   throws EncryptedDocumentException, InvalidFormatException, IOException {
  //String SheetName = "BrowserDetails";
  File file = new File(filePath);
 // File file = new File(filePath);
  FileInputStream fis = new FileInputStream(file);
  Workbook wb = WorkbookFactory.create(fis);
  Sheet sheet = wb.getSheet(sheetName);
  // it will take value from first row
//  int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
//  System.out.println(rowCount);
  Row row = sheet.getRow(0);
// it will give you count of row which is used or filled
  short lastcolumnused = row.getLastCellNum();

  int colnum = 0;
  for (int i = 0; i < lastcolumnused; i++) {
   if (row.getCell(i).getStringCellValue().equalsIgnoreCase(ColumnName)) {
    colnum = i;
    break;
   }
  }

  // it will take value from Second row
 // row = sheet.getRow(1);
  row = sheet.getRow(RowNum);
  Cell column = row.getCell(colnum);
  String CellValue = column.getStringCellValue();

  return CellValue;

 }
 }
