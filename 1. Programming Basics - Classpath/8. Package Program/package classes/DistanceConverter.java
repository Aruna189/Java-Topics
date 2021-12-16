package Converter;
public class DistanceConverter {
    public static double mtokm(double m){
        return m/1000;
    }
    public static double kmtom(double km){
        return km*1000;
    }
    public static double miletokm(double mile){
        return mile*1.6;
    }
    public static double kmtomile(double km){
        return km/1.6;
    }
}
