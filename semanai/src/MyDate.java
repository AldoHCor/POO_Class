public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(){
        day = 1;
        month = 1;
        year = 1;
    }
    public MyDate(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }
    public String getWholeDate(){
        String wholeDate;
        wholeDate = day + "/" + month + "/" + year;
        return wholeDate;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int d){
        day = d;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int m){
        month = m;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int y){
        year = y;
    }
    public boolean leapYear(){
        if(getYear() % 4 != 0){
            return false;
        }
        else
        if(getYear() % 100 != 0){
            return true;
        }
        else
        if(getYear() % 400 != 0){
            return false;
        }
        else
            return true;
        /**
         if (year is not divisible by 4) then (it is a common year)
         else if (year is not divisible by 100) then (it is a leap year)
         else if (year is not divisible by 400) then (it is a common year)
         else (it is a leap year)
         */
    }
    public boolean compareDate(int d, int m, int y){
        if (day == d && month == m && year == y){
            return true;
        }
        else{
            return false;
        }
    }
    public int dayOfTheYear(){
        int days = 0;
        switch(month){
            case 1:
                days = day;
                break;
            case 2:
                days = 31 + day;
                break;
            case 3:
                days = 59 + day;
                break;
            case 4:
                days = 90 + day;
                break;
            case 5:
                days = 120 + day;
                break;
            case 6:
                days = 151 + day;
                break;
            case 7:
                days = 181 + day;
                break;
            case 8:
                days = 212 + day;
                break;
            case 9:
                days = 243 + day;
                break;
            case 10:
                days = 273 + day;
                break;
            case 11:
                days = 304 + day;
                break;
            case 12:
                days = 334 + day;
                break;
        }
        if ((leapYear()) && (month != 1)){
            days += 1;
        }
        return days;
    }
    public boolean validDate(){
        if (getMonth() <= 0){
            return false;
        }
        else
            switch (getMonth()){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (getDay() <= 31){
                        return true;
                    }
                    else
                        return false;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (getDay() <= 30){
                        return true;
                    }
                    else
                        return false;
                case 2:
                    if(leapYear()){
                        if(getDay() <= 29){
                            return true;
                        }
                        else
                            return false;
                    }
            }
        return false;
    }
}