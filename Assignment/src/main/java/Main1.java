import goal_1.ExtractWords;
import goal_1.QueryParameters;
import goal_1.QuerySplit;
import goal_3.MakeMap;
import goal_3.readCsvFile;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Helo");
		QuerySplit querySplit=new QuerySplit();
		String query=querySplit.input();
		String Arr[] = querySplit.split1(query);
		System.out.println("Splitted Query:");
		for(String var:Arr) {
			System.out.println(var);
		}
		ExtractWords extract=new ExtractWords();
		QueryParameters obj1=extract.find(query);
		System.out.println("OO Result-------------------");
		  System.out.println("Filename "+obj1.getFileName());
		  System.out.println("Before Where "+obj1.getBeforeWhere());
		  System.out.println("After Where "+obj1.getAfterWhere());
		  System.out.println("Conditions "+obj1.getConditions());
		  System.out.println("Get Columns "+obj1.getColumns());
		  System.out.println("Columns in Order By "+obj1.getColumnsOrderBy());
		  System.out.println("Columns in Group By "+obj1.getColumnsGroupBy());
		System.out.println("CSV File-------------------"); 
		
		 readCsvFile readFile=new readCsvFile();
		 readFile.read();
		 
		 MakeMap mp=new MakeMap();
//		 LinkedHashMap<String,ArrayList<Object>> map = mp.FileRead();
//		 int row=mp.getHeader();
	//System.out.println("Filtering data on Select Fields:");
//	    filterData filteringData=new filterData();
//	     filteringData.filterSelectedField();	  
		  
//		DisplayData obj1=new DisplayData();
//		obj1.display();
		
	}

}