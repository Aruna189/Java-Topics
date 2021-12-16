import Converter.*;
import java.util.*;
public class PackageProgram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("-------------Conversion------------");
        System.out.println("\n1. Distance Conversion\n2. Time Conversion\n3. Weight Conversion\n");
        choice = sc.nextInt();
        double n;
        switch(choice){
            case 1:
                {
                    System.out.println("~~~~~~~~~~~~~Distance Conversion~~~~~~~~~~~~~");
                    System.out.println("\n1. Miles to Km\n2. Km to Miles\n3. Metre to Km\n4. Km to Metre\n");
                    int ch = sc.nextInt();
                    switch(ch){
                        case 1:
                            System.out.println("Enter the distance in miles : ");
                            n = sc.nextDouble();
                            System.out.println("Distance in km : "+ DistanceConverter.miletokm(n));
                            break;
                        case 2:
                            System.out.println("Enter the distance in km : ");
                            n = sc.nextDouble();
                            System.out.println("Distance in miles : "+ DistanceConverter.kmtomile(n));
                            break;
                        case 3:
                            System.out.println("Enter the distance in metre : ");
                            n = sc.nextDouble();
                            System.out.println("Distance in Km : "+ DistanceConverter.mtokm(n));
                            break;
                        case 4:
                            System.out.println("Enter the distance in km : ");
                            n = sc.nextDouble();
                            System.out.println("Distance in m : "+ DistanceConverter.kmtom(n));
                            break;
                    }
                    break;
                }
            case 2:
                {
                    System.out.println("~~~~~~~~~~~~~Time Conversion~~~~~~~~~~~~~");
                    System.out.println("\n1. Hour to Minute\n2. Minute to Hour\n3. Hour to Second\n4. Second to hour\n");
                    int ch = sc.nextInt();
                    switch(ch){
                        case 1:
                            System.out.println("Enter the time in hours : ");
                            n = sc.nextDouble();
                            System.out.println("Time in Km : "+ TimeConverter.hrtomin(n));
                            break;
                        case 2:
                            System.out.println("Enter the time in minutes : ");
                            n = sc.nextDouble();
                            System.out.println("Time in hours : "+ TimeConverter.mintohr(n));
                            break;
                        case 3:
                            System.out.println("Enter the time in hours : ");
                            n = sc.nextDouble();
                            System.out.println("Time in Seconds: "+ TimeConverter.hrtosec(n));
                            break;
                        case 4:
                            System.out.println("Enter the time in seconds : ");
                            n = sc.nextDouble();
                            System.out.println("Time in hours : "+ TimeConverter.sectohr(n));
                            break;
                    }
                    break;
                }
            case 3:
                {
                    System.out.println("~~~~~~~~~~~~~Weight Conversion~~~~~~~~~~~~~");
                    System.out.println("\n1. Kilogram to Gram\n2. Gram to Kilogram\n3. Kilogram to Tonne\n4. Tonne to Kilogram\n");
                    int ch = sc.nextInt();
                    switch(ch){
                        case 1:
                            System.out.println("Enter the weight in kilogram : ");
                            n = sc.nextDouble();
                            System.out.println("Weight in Gram : "+ Converter.WeightConverter.kgtogram(n));
                            break;
                        case 2:
                            System.out.println("Enter the weight in gram : ");
                            n = sc.nextDouble();
                            System.out.println("Weight in Kilogram : "+ Converter.WeightConverter.gramtoKg(n));
                            break;
                        case 3:
                            System.out.println("Enter the weight in kilogram : ");
                            n = sc.nextDouble();
                            System.out.println("Weight in Tonne : "+ Converter.WeightConverter.kgtotonne(n));
                            break;
                        case 4:
                            System.out.println("Enter the weight in tonne : ");
                            n = sc.nextDouble();
                            System.out.println("Weight in Kilogram : "+ Converter.WeightConverter.tonnetokg(n));
                            break;
                    }
                    break;
                }
        }
    }
}
