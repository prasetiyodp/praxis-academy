class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    void changeCadence(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }
    void speedUp(int increament){
        speed = speed + increament;
    }
    void applyBraskes (int decreament){
        speed = speed - decreament;
    }
    void printStates(){
        System.out.println("Candence:" + cadence + "Speed :" + speed + "Gear :" + gear);
    }   
}
