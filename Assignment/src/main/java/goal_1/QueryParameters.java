/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package goal_1;

import java.util.ArrayList;

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

  public void setFileName(String fileName){
      this.filename=fileName;
  }

  public String getFileName(){
      return this.filename;
  }

   public void setBeforeWhere(String beforeWhere){
      this.beforeWhere=beforeWhere;
  }

  public String getBeforeWhere(){
      return this.beforeWhere;
  }

   public void setAfterWhere(String afterWhere){
      this.afterWhere=afterWhere;
  }

  public String getAfterWhere(){
      return this.afterWhere;
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
}