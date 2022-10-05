package Services;
import Entities.Time;

public class TimeService {

    public TimeService() {
    }

    public Time createTime(int h, int m, int s){
        Time validTime;
        if (h>=0 && h <=23 && m>=0 && m <=59 && s>=0 && s <=59){
            validTime = new Time(h,m,s);
        } else {
            validTime = new Time(0,0,0);
            System.out.println("La hora ingresada no es valida");
        }
        return validTime;
    }

    public void advanceTime(Time time, int s) {
        int timeToAdvance;
        int aux;

        timeToAdvance = time.getSegundos() + s;
        if (timeToAdvance>59){

            aux = timeToAdvance /60;
            time.setSegundos(timeToAdvance-(59*aux)-1);

            timeToAdvance =  time.getMinutos() + aux;

            if (timeToAdvance>59){
                aux = timeToAdvance / 60;
                time.setMinutos(timeToAdvance-(59*aux)-1);
                
                timeToAdvance = time.getHoras() + aux;
                if (timeToAdvance>23){

                    aux = timeToAdvance / 24;
                    time.setHoras(timeToAdvance-(23*aux)-1);

                } else time.setHoras(timeToAdvance);

            } else time.setMinutos(timeToAdvance);
        } else time.setSegundos(timeToAdvance);
        
    }
    public static void main(String[] args) {
        Time test;
        TimeService operate = new TimeService();
        test = operate.createTime(23, 0, 0);
        System.out.println(test);
        for (int i=1; i<=80;i++){
            operate.advanceTime(test, (60));
            System.out.println(test);
        }
    }
}
