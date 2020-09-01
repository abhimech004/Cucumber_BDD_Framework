package Step_Definition;

public class DemoExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		ReadWriteXLS xls = new ReadWriteXLS();        
        System.out.println(xls.getCellData("C:\\Users\\abhim\\OneDrive\\Desktop\\Data.xlsx","BrowserDetails","URL",2));
      //  System.out.println(xls.getCellData("BrowserDetails","URL",3));

	}

}
