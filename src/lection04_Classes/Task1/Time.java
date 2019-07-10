package lection04_Classes.Task1;

class Time {
    private int hours, minutes, seconds;

    Time(){
        hours=0;
        minutes=0;
        seconds=0;
    }
    Time(int s){
        seconds=s%60;
        s/=60;
        minutes = s%60;
        hours = s/60;

    }
    Time(int h,int m,int s){
        if(s>=60){
            m+=s/60;
            seconds=s%60;
        }
        if(m>=60){
            h+=m/60;
            minutes=m%60;
        }
        hours = h;
    }

    void getTime(){
        System.out.printf("Time is: %02d:%02d:%02d",hours,minutes,seconds);
    }

    int getSeconds(){
        if(hours>0){
            seconds+=hours*3600;
        }
        if(minutes>0){
            seconds+=minutes*60;
        }
        return seconds;
    }
}
