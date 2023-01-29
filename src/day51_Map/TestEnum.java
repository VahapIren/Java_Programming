package day51_Map;

public class TestEnum {
    public static void main(String[] args) {


        Browser browser = Browser.CHROME;

        switch (browser) {
            case CHROME:
                System.out.println("Chrome is selected");
                break;
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;
            case OPERA:
                System.out.println("Opera is selected");
                break;
            case EDGE:
                System.out.println("Edge is selected");
                break;
            default:
        }

        Season season = Season.SUMMER;
        switch (season) {
            case WINTER:
                System.out.println("Winter is selected");
                break;
            case SPRING:
                System.out.println("Spring is selected");
                break;
            case SUMMER:
                System.out.println("Summer is selected");
                break;
            case FALL:
                System.out.println("Autumn is selected");
                break;


        }
    }
}
