public class Memory {

    private double storedValue;
    public void addtoMemory(double newValue){
        storedValue += newValue;
    }
    public double recallMemory(){
       return storedValue;

    }
    public void clearMemory(){
       storedValue=0.0;
    }
}

