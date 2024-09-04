public class Pratica17 {
  public static void main(String[] args) {
//obs:criar um objeto com o mesmo nome da classe porém com a letra
//    inicial minúscula é um boa prática adotada pela comunidade
//    Pratica17_class01 pratica17_class01 = new Pratica17_class01();
    Pratica17_class_02 object_02 = new Pratica17_class_02();
    Pratica17_interface_01 pratica17_interface01 = new Pratica17_interface_01();
    Pratica17_interface_02 pratica17_interface02 = new Pratica17_interface_02();


//    Não é seguro configurar o "objeto.nome" diretamente fora da classe
//    para isso, na classe (Pratica17_class) se usa o this.
//    para referir-se ao objeto que só então pode ser acessado.

//    objeto.nome = "Luan";
//    objeto.notaTeste = 9;
//    objeto.notaProva = 9.5;

//     class_01

    System.out.println("________ Class_01 _____________");
    System.out.println("______ Intercafe_01 ___________");
    pratica17_interface01.setNome("Luan");
    pratica17_interface01.setNotaTeste(9);
    pratica17_interface01.setNotaProva(6);

    System.out.println(pratica17_interface01.getNome());
    System.out.println(pratica17_interface01.getMedia());

    System.out.println("______ Intercafe_02 ___________");
    pratica17_interface02.setNome("Luan");
    pratica17_interface02.setNotaTeste(9);
    pratica17_interface02.setNotaProva(6);

    System.out.println(pratica17_interface02.getNome());
    System.out.println(pratica17_interface02.getMedia());

//    class_02

    System.out.println("________ Class_02 _____________");
    object_02.setNome("Kisaki");
    object_02.setSalario(1500);
    System.out.println(object_02.getNome());
    System.out.println(object_02.getInss());
    System.out.println(object_02.getSalarioLiquido());

//    interface
    pratica17_interface01.nome = "Teixeira";
    pratica17_interface01.notaTeste = 9;
    pratica17_interface01.notaProva = 9;

    System.out.println("________ Interface _____________");
    System.out.println("Aluno do ensino médio (class_01)");
    System.out.println("Nome: "+ pratica17_interface01.nome);
    System.out.println("Média: "+ pratica17_interface01.getMedia());
  }
}
