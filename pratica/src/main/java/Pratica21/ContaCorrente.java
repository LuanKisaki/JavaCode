package Pratica21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ContaCorrente {
  public static void main(String[] args) {

    Conta conta1 = new Conta("Luan", 2222);
    Conta conta2 = new Conta("Kisaki", 3333);
    Conta conta3 = new Conta("Teixeira", 4444);

    List<Conta> contas = new ArrayList<Conta>();
    contas.add(conta1);
    contas.add(conta2);
    contas.add(conta3);

    contas.sort(new Comparator<Conta>() {
      @Override
      public int compare(Conta o1, Conta o2) {
        if (o1.getSaldo() > o2.getSaldo()) return 1;
        else return -1;
      }
    });

    Iterator<Conta> iterator = contas.iterator();
    while (iterator.hasNext()) {
      Conta conta = iterator.next();
      System.out.println(conta);
    }
  }
}
