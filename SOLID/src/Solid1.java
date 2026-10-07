//Single Responsibility Principle - A class should have one responsibility to change.
class BreadBaker{
    public void makeBread(){
        System.out.println("Bread");
    }
}

class JamMaker{
    public void makeJam(){
        System.out.println("Jam");
    }
}

public class Solid1{
    public static void main(String[] args){
        //now each class focus on its own.
        BreadBaker b = new BreadBaker();
        JamMaker j = new JamMaker();

        b.makeBread();
        j.makeJam();
    }
}

