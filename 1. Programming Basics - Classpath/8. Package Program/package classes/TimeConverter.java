package Converter;
public class TimeConverter {
    public static double hrtomin(double hr){
        return hr*60;
    }
    public static double mintohr(double min){
        return min/60;
    }
    public static double hrtosec(double hr){
        return hr*60*60;
    }
    public static double sectohr(double sec){
        return sec/60/60;
    }
}
