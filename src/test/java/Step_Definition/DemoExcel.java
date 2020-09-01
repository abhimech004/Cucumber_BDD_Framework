package Step_Definition;

public class DemoExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		String val = GetCellValueBasedOnColumnName.readdatafromExcelusingcolumnName("C:\\Users\\abhim\\OneDrive\\Desktop\\Data.xlsx","BrowserDetails","URL", 1);
		System.out.println(val);

	}

}
