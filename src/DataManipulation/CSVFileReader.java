package DataManipulation;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVFileReader {
	
	public void testJohn(){}
	
	public void testJohn(String file){
		FileReader fileReader; 
		List<String[]> dataList = null;
		try{
			fileReader = new FileReader(file);
			CSVReader reader = new CSVReader(fileReader);
			dataList = reader.readAll();
			reader.close();
		}
		catch(FileNotFoundException e){}
		catch(IOException e ){}
	}
	
	public void test(){
<<<<<<< HEAD
	//for john <3
=======
		//for john <3
		while(true){
			//please work
		}
>>>>>>> refs/heads/sunnyBranch
	}
	
	public List<String[]> readFile(String file){
		FileReader fileReader; 
		List<String[]> dataList = null;
		
		try{
			fileReader = new FileReader(file);
			CSVReader reader = new CSVReader(fileReader);
			dataList = reader.readAll();
			reader.close();
		}
		catch(FileNotFoundException e){}
		catch(IOException e ){}
		
		return dataList;
	}
}
