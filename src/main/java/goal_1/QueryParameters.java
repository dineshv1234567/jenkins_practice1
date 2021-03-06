/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package goal_1;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author Dinesh
 */
public class QueryParameters {
  private String filename=null, beforeWhere=null, afterWhere=null;
  private ArrayList<String> conditions=new ArrayList<String>();
  public ArrayList<String> columns=new ArrayList<String>();
  private ArrayList<String> columnsOrderBy=new ArrayList<String>();
  private ArrayList<String> columnsGroupBy=new ArrayList<String>();
  private ArrayList<String> operator=new ArrayList<String>();

  public void setFileName(String fileName) throws Exception{
	  if(Pattern.compile("1.csv",Pattern.CASE_INSENSITIVE).matcher(fileName).matches())
		  {throw new Exception();}
	  else
      this.filename=fileName;
  }

  public String getFileName(){
      return filename;
  }

   public void setBeforeWhere(String beforeWhere){
      this.beforeWhere=beforeWhere;
  }

  public String getBeforeWhere(){
      return beforeWhere;
  }

   public void setAfterWhere(String afterWhere){
      this.afterWhere=afterWhere;
  }

  public String getAfterWhere(){
      return afterWhere;
  }

  public void addConditions(String cond){
      this.conditions.add(cond);
  }

   public ArrayList<String> getConditions(){
      return conditions;
  }

   public void addColumns(String col){
      this.columns.add(col);
  }

   public ArrayList<String> getColumns(){
       return columns;

  }

   public void addColumnsOrderBy(String col){
      columnsOrderBy.add(col);
  }

   public ArrayList<String> getColumnsOrderBy(){
      return columnsOrderBy;
  }

   public void addColumnsGroupBy(String col){
      columnsGroupBy.add(col);
  }

   public ArrayList<String> getColumnsGroupBy(){
      return columnsGroupBy;
  }
   
   public void addOperator(String col){
	      operator.add(col);
	  }

  public ArrayList<String> getOperator(){
	      return operator;
	  }
}
