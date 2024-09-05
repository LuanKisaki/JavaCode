import java.sql.Timestamp;
import java.util.Date;

public class Pratica20 {
  public static void main(String[] args) {


// StringBuffer
    Date dataBuffer = new Date();
    long inicioStringBuffer = dataBuffer.getTime();

    System.out.println("_____________________ StringBuffer _____________________");
    System.out.println("Hora de início do StringBuffer: " + new Timestamp(inicioStringBuffer));

    StringBuffer stringBuffer = new StringBuffer("AA");

    for (int i = 0; i < 10000; i++) {
      stringBuffer.append(i);
    }

    Date eDataBuffer = new Date();

    long fimSpringBuffer = eDataBuffer.getTime();

    System.out.println("Fim do tempo do StringBuffer: " + new Timestamp(fimSpringBuffer));
    System.out.println("Tempo gasto para executar StringBufferprocess " + (fimSpringBuffer - inicioStringBuffer) + "ms");


    // StringBuilder
    Date dataBuilder = new Date();
    long inicioStringBuilder = dataBuilder.getTime();

    System.out.println("_____________________ StringBuilder _____________________");
    System.out.println("Hora de início do StringBuilder: " + new Timestamp(inicioStringBuilder));

    StringBuilder stringBuilder = new StringBuilder("AA");

    for (int i = 0; i < 10000; i++) {
      stringBuilder.append(i);
    }

    Date eDataBuilder = new Date();

    long fimSpringBuilder = eDataBuilder.getTime();

    System.out.println("Fim do tempo do StringBuilder: " + new Timestamp(fimSpringBuilder));
    System.out.println("Tempo gasto para executar StringBuilderprocess " + (fimSpringBuilder - inicioStringBuilder) + "ms");



// String
    System.out.println("_____________________ String _____________________");

    Date strData = new Date();
    long strTime = strData.getTime();

    System.out.println("Hora de início para String: " + new Timestamp(strTime));

    String str = new String("AA");

    for (int i = 0; i < 10000; i++) {
      str += i;
    }

    Date eStrDate = new Date();
    long eStrTime = eStrDate.getTime();

    System.out.println("Fim do tempo para String: " + new Timestamp(eStrTime));
    System.out.println("Tempo gasto para executar Stringprocess " + (eStrTime - strTime) + "ms");

  }
}

