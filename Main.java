
public class Main {

  public static void main(String[] args) {
    String[] values ={"Nexa2f5","Z52Bizlm","Diskapr","emkem9sD","LaWYr4Us","dAStn78L","mPTuriye","aaeeiuUu","IL8Ctmpn"};

    for (int i=0; i<values.length; i++) {
      if(i%2==1) {
     
        System.out.print(values[i].charAt(2));
        System.out.print(values[i].charAt(3));
      }
      else {
        System.out.print(values[i].charAt(4));
      }
    }

  }

}
