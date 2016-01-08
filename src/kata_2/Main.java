package kata_2;


public class Main{

    
    public static void main(String[] args) {
        Integer[] vector = {1,4,7,1,1,8,4,1,4,9};
        String[] vector1 = {"Ana", "Juan", "Pedro", "Ana", "Juan", "Juan"};
        
        Histogram <Integer> histogram = CalculaHistogram.calcHisto(vector);
        for (Object key : histogram.keySet()) {
            System.out.println(key + " ->" + histogram.get(key));
            
        }
        Histogram <String> histogram2 = CalculaHistogram.calcHisto(vector1);
        for (Object key : histogram2.keySet()) {
            System.out.println(key + " ->" + histogram2.get(key));
            
        }
    }
    
}
