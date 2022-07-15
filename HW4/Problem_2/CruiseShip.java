public class CruiseShip extends Ship{
        private int max_passengers;
        private String nameCruiseship;
    

        CruiseShip(String name, int passengers){

            this.max_passengers = passengers;
            this.nameCruiseship = name;

        }

        public int getPassengers(){
            return max_passengers;
        }

        public void setPassengers(int p){
            max_passengers = p;
        }
        
        public String getName(){
            return nameCruiseship;
        }

        public void setName(String n){
            nameCruiseship = n;
        }

        @Override
        public String toString(){
            String str = "\nCruise Ship Details \nName: " + getName() +
                         "\nMaximum number of passengers: " + getPassengers();
    
            return str;
        }


}
