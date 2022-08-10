package interviewProgram;
/*
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadKeyValueXL {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String[] str=readXlSheet("C:\\Users\\VHEGDE\\Desktop\\javascreenshot\\javascipt\\keyvalue.xls","Sheet1");

		int row=str.length;
		HashMap m=new HashMap();
		
		for(int i=0;i<str.length;i++)
		{
			String[] val=str[i].split(",");
			for(int j=0;j<val.length;j++)
			{
				String[] data=val[j].split("-");
				m.put(data[0], data[1]);
			}
		}
		
		Set s=m.entrySet();
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me=(Entry) it.next();
			System.out.print("Key:"+me.getKey());
			System.out.print("  Value:"+me.getValue());
			System.out.println();
		}
	}
	
	public static String[] readXlSheet(String dt_path,String sheetName) throws IOException
	{
		//Step1: Get the Xl Path
		File xlFile= new File(dt_path);

		//Step 2:Access the Xl file
		FileInputStream xlDoc=new FileInputStream(xlFile);

		//Step 3:Aceess the workbook
		HSSFWorkbook wb=new HSSFWorkbook(xlDoc);

		//Step 4:Access the worksheet
		HSSFSheet sheet=wb.getSheet(sheetName);

		int iRowCount=sheet.getLastRowNum()+1;
		

		String[] xlData=new String[iRowCount];

		for(int i=0;i<iRowCount;i++)
		{
			
				xlData[i]=sheet.getRow(i).getCell(0).getStringCellValue();

		}
		return xlData;
	}

}
*/