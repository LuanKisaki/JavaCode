public class Pratica19 {
  public static void main(String[] args) {

    String nomeComBuffer, nomeComBuilder;
    String nome = "Luan";
    String sobreNome = "Kisaki";
    String nomeCompleto = nome + sobreNome;

//    System.out.println(nome +" "+ sobreNome);

    // StringBuffer
    StringBuffer buffer = new StringBuffer();
    buffer.append(nome);
    buffer.append(sobreNome);

    nomeComBuffer = buffer.toString();

    System.out.println(nomeCompleto);
    System.out.println(nomeComBuffer);

    // StringBuilder
    StringBuilder builder = new StringBuilder();
    nomeComBuilder = builder.toString();

    builder.append(nome);
    builder.append(sobreNome);

    nomeComBuilder = builder.toString();
    System.out.println(nomeComBuilder);

  }
}
