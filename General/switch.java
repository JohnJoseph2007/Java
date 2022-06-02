package General;
import java.util.*;
class switchstatement {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int monthnum = 0;
        System.out.println("Enter the month number");
        monthnum = obj.nextInt();
        String monthstring = "";
        switch (monthnum) {
            case 1:monthstring = "Jan";break;
            case 2:
                monthstring = "Feb";
                break;
            case 3:
                monthstring = "Mar";
                break;
            case 4:
                monthstring = "Apr";
                break;
            case 5:
                monthstring = "May";
                break;
            case 6:
                monthstring = "Jun";
                break;
            case 7:
                monthstring = "Jul";
                break;
            case 8:
                monthstring = "Aug";
                break;
            case 9:
                monthstring = "Sep";
                break;
            case 10:
                monthstring = "Oct";
                break;
            case 11:
                monthstring = "Nov";
                break;
            case 12:
                monthstring = "Dec";
                break;
            default:
                monthstring="Month Number Invalid";
                break;
        }
        obj.close();
        System.out.println("The month is "+monthstring);
    }
}
