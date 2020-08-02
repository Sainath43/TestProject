package Package1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test1 {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		File f= new File("./data/Testingsheet.xls");//important
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int Columns = s.getColumns();
		int rows = s.getRows();
		System.out.println(Columns+"  "+rows);

		String inputData [] []= new String [rows] [Columns];
		for (int i=0; i<rows;i++ ) {
			for(int j=0; j<Columns; j++) {
				Cell c =s.getCell(j,i);
				inputData[i][j]= c.getContents();
				System.out.println(inputData[i][j]);
			}
		}
		  

			}

		}
	
