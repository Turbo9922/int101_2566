package work03;

public class Myutil {
    public static double calculateBMI(double weight,double height) {
        height/=100;
        double result = weight/(height*height);
        return result;
    }
    public static int average(int v1,int v2,int v3){
        return v1+v2+v3/3;
    }

}
