package Pratica22;

public class Main {
  public static void main(String[] args){
    DbFunction db = new DbFunction();
    db.dbConnect("Banco_Descomplica", "postgres", "lu09");
  }
}
