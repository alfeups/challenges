package main.nelioalves;

public class BoxingUndUnboxing {

    public static void main(String[] args) {

        String[] vect = new String[] { "Maria", "Bob", "Alex"};

        for (int i = 0; i<vect.length; i++){ // ou for (String s : vect)
            System.out.println(vect[i]);
        }

        System.out.println("----------------------");
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
