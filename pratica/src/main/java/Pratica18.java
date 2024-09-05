public class Pratica18 {
  public static void main(String[] args){

    String nome = "Luan Kisaki Teixeira";

    System.out.println(nome);
    System.out.println(" Luan Kisaki Teixeira "+"SemTrim");
    System.out.println(" Luan Kisaki Teixeira ".trim()+"comTrim");
    System.out.println(nome+"SemTrim");
    System.out.println(nome.trim()+"ComTrim");
    System.out.println(nome.length());
    System.out.println("kisaki".substring(1,5));
    System.out.println(nome.toLowerCase());
    System.out.println(nome.toUpperCase());
    System.out.println(nome.charAt(2));
    System.out.println(nome.isEmpty());
    System.out.println(nome.indexOf("an"));
    System.out.println(nome.contains("ki"));
    System.out.println(nome.contains("Ki"));
    System.out.println(nome.concat("Teixeira"));
    System.out.println(nome.equals("luan kisaki"));
    System.out.println(nome.equalsIgnoreCase("luan kisaki"));
  }
}
