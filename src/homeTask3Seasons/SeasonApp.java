package homeTask3Seasons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonApp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter month (dec/jan/etc...)");
        String currentMonth = br.readLine();
        SeasonEnum currentSeasonEnum = SeasonEnum.DEFAULT;

        switch (currentMonth.toLowerCase()) {
            case "dec":
            case "jan":
            case "feb":
                currentSeasonEnum = SeasonEnum.WINTER;
                break;
            case "mar":
            case "apr":
            case "may":
                currentSeasonEnum = SeasonEnum.SPRING;
                break;
            case "jun":
            case "jul":
            case "aug":
                currentSeasonEnum = SeasonEnum.SUMMER;
                break;
            case "sep":
            case "oct":
            case "nov":
                currentSeasonEnum = SeasonEnum.AUTUMN;
                break;
            default:
                System.out.println("No such month");
        }
        if (currentSeasonEnum != SeasonEnum.DEFAULT) {
            System.out.println("The current season is " + currentSeasonEnum);
        }
    }
}
