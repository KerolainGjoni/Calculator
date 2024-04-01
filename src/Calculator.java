public class Calculator {
   private Memory memory = new Memory();
    public double gjejShumen(double nr1, double nr2){
        double rezultati = nr1+ nr2;
        memory.addtoMemory(rezultati);
        return rezultati;
    }
    public double gjejZbritjen(double nr1, double nr2){
        double rezultati = nr1-nr2;
        memory.addtoMemory(rezultati);
        return rezultati;
    }
    public double gjejShumzimin(double nr1, double nr2){
        double rezultati = nr1* nr2;
        memory.addtoMemory(rezultati);
        return rezultati;
    }
    public double gjejPjestimin(double nr1, double nr2) {

        if (nr2 != 0) {
            double rezultati = nr1 / nr2;
            memory.addtoMemory(rezultati);
            return rezultati;
        } else {
            System.out.println("pjestimi nuk mund te kryhet");
            return 0.0;
        }
    }
    public double recallMemory(){return memory.recallMemory();}
    public void clearMemory(){memory.clearMemory();}
    public void addToMemory(double value){memory.addtoMemory(value);}
}
