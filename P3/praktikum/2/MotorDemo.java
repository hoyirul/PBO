public class MotorDemo{
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();
        
        motor.nyalakanMesin();
        motor.printStatus();

        int i = 0;
        while(i < 25){
            motor.tambahKecepatan();
            motor.printStatus();
            i += 1;
        }

        motor.matikanMesin();
        motor.printStatus();
    }
}