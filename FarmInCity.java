// A simple java program that tells a story about a farm in the cit


class Person {  
    public String name = "";  
    boolean hasPet = false; 
    public void ownsDog(){ 
    boolean hasPet = true; 

    System.out.println(name + " is a pet lover!"); 
    } 
     
} 

class TrafficEnforcer extends Person { 
    public void whistle(){ 
        System.out.println(name +": *fweeeet fweeeet*"); 
        } 
    } 

class Pedestrian extends Person { 
    public void crossTheRoad(){ 
    System.out.println(name + " crosses the road"); 
    } 

    public void rideTheVehicle() { 
    } 

    public void rideTheVehicle( Vehicle sakay){ 
        if (sakay instanceof Bus) { 
        sakay.passengerCount = sakay.passengerCount + 1; 
        System.out.println("\nPassenger/s on the last bus trip: " + sakay.pas sengerCount); 
        } 
    } 
} 

    class Farmer extends Person { 
        public void till(){ 
        System.out.println("\n*plants plants*"); 
        } 
}

    class Commuters extends Person { 
        public void commute(){ 
        System.out.println( name + ": *rides the bus*"); 
    } 
    
        public void chant(){ 
        System.out.println("\n\033[1m Pulis, Pulis, Pulis ang Terorista!\033[0 m"); 
    } 
} 

//CLASS & SUBCLASS OF VEHICLE 

    class Vehicle { 
        public int passengerCount = 0; 
        public void honk(){ 
        System.out.println("*beeep beeep*"); 
        } 
    } 

    class PoliceCar extends Vehicle{ 
        public void kotong(){ 
        System.out.println("*pinara ang jeep*"); 
    } 

    @Override 
    public void honk(){ 
        System.out.println("\nA police car is approaching! *weeeeeeeu weeeeeeeu*" ); 
    } 
    } 
     
    class Bus extends Vehicle{ 
        public void busStation(){ 
            System.out.println("\nBus Conductor: We have finally reached our destinat ion"); 
            System.out.println("\t[\033[3m Dahil dýan, minimum wage itaas! \033[0m]\n "); 
        } 

        public void loadPassenger(){ 
            passengerCount += 5;
            System.out.println("Passenger/s currently on board: " + (passengerCount)) ; 
        } 

    public void unloadPassenger(){ 
        if (passengerCount > 5){ 
            passengerCount -= 5; 
            System.out.println("Passenger/s left on the bus: " + (passengerCount - 1)); 
        } 
        else { 
            passengerCount -= 5; 
            System.out.println("Passenger/s left on the bus: " + (passengerCount) ); 
        } 
    } 
    } 

   class Jeepney extends Vehicle{ 
        public void chant(){ 
        System.out.println("\t\033[1m No to Jeepney Phaseout!\n \033[0m"); // \03 3[1m & \033[0m are used to bold the texts 
        } 
   } 

   class Car extends Vehicle{ 
        public void roll(){ 
        System.out.println("*rolled down the window*"); 
        } 
} 

// CLASS & SUBCLASS OF ANIMAL: 
   class Animal { 
        public String type = ""; 
        public String name = ""; 
    } 
     
    class Cow extends Animal { 
        public void ringBell(){ 
        System.out.println(name +" the "+ type +"'s bell rang! *krung krung*");  }
    } 
     
    class Chicken extends Animal { 
        public void crossTheRoad() { 
        System.out.println(name +" the "+ type +" crosses the road");  } 
    } 
     
    class Dog extends Animal { 
        boolean hasOwner = false; 
        public void isOwned(){ 
        boolean hasOwner = true; 
        System.out.println("Is Dewdirty adopted?: "+ hasOwner);  
    } 
     
    public void owner(String nameOwner){ 
        System.out.println(name +" is now the " +type + " of "+ nameOwner);  } 
    public void expression() { 
        System.out.println(name +" the "+ type +": *puppy eyes*");  } 
    } 

//CLASS TRAFFICLIGHT  
    class TrafficLight { 
        String signal; 
        public void turn (String color) { 
        signal = color; 
    } 
     
    public void showColor() { 
        System.out.println("Traffic light signal on: " + signal);  } 
    } 

    public class FarmInCity { 
        public static void main(String[] args) { 
            Farmer farm = new Farmer(); 
            Cow zea = new Cow (); 
            Chicken chick = new Chicken();
            Pedestrian peer = new Pedestrian(); 
            Bus byahe = new Bus(); 
            Dog pup = new Dog(); 
            TrafficLight light = new TrafficLight(); 
            TrafficEnforcer enforcer = new TrafficEnforcer(); 
            PoliceCar police = new PoliceCar(); 
            Car kotse = new Car(); 
            Jeepney jeep = new Jeepney(); 
            Commuters workers = new Commuters(); 
            Person furParent = new Person(); 
            peer.name = "Ju"; //object 
            farm.name = "Mang Jose"; 
            System.out.println("\n[ \033[3m The sun has risen earlier today than ye sterday, indeed, summer season is approaching.\033[0m"); 
            System.out.println(" \033[3m Just like the sun, Mang Jose also woke up early to go farming. \033[0m"); 
            System.out.println(" \033[3m "+farm.name+ ", together with other farme rs, don't have their own land to till near the city.\033[0m");  System.out.println(" \033[3m This is because of the bureaucrat capital ist family, the Cojuancos,\n who promised them agricultural development but h armed them instead \033[m ]\n"); 
            
            zea.type = "Jersey Cow"; 
            zea.name = "ZZ"; 
            zea.ringBell(); 
            // \033[3m & \033[0m are used to italicize the texts 
            System.out.println("\n[ \033[3m The farmers are greeted by the cows, an d the chickens too. They then proceeded to till the land.\033[0m ]"); 
            farm.till(); 
            System.out.println("\n[ \033[3m However, some of the chickens are tryin g to cross the road! \033[0m ]\n"); 
            
            chick.type = "Tandang"; 
            chick.name = "Paboritong Anak"; 
            chick.crossTheRoad(); 
            System.out.println("\n[\033[3m It was hard to catch the chickens becau se people who need to ride the bus are everywhere\033[0m ]\n"); 
            byahe.honk();
            workers.name = "Group of Workers"; 
            workers.commute(); 
            byahe.loadPassenger(); 
            byahe.loadPassenger(); 
            System.out.println("\n[\033[3m Good thing that the traffic enforcer si gnalled to his coworker to change the traffic light into stop signal .\033[0m ] \n"); 
            enforcer.name = "Cardo"; 
            enforcer.whistle(); 
            light.turn("RED"); 
            light.showColor(); 
            
            System.out.println("\n[\033[3m Meanwhile, on the city proper, a dog i s on the street, seemingly lost \033[0m]\n"); 
            pup.type = "Tuta"; 
            pup.name = "Dewdirty"; 
            furParent.name = "China"; 
            pup.expression(); 
            System.out.println("\n[\033[3m China saw Dewdirty, and when she notic ed that it seems lost, she decided to bring it with her to the clinic \033[0m]\n" ); 
            furParent.ownsDog(); 
            pup.isOwned(); 
            pup.owner(furParent.name); 
            police.honk(); 
            System.out.println("\n[\033[3m A police is coming, they might possibly impose facism since they are abusive just like du30\033[0m ]\n");  police.kotong(); 
            System.out.println("\n[\033[3m As expected, the police harrasses the d river, pressing that the driver violated a protocol \033[0m ]");  System.out.println("[ \033[3m When the cars and other jeeps saw the com motion, they collectively defended the driver ]\033[0m\n"); 
            kotse.honk(); 
            kotse.roll(); 
            jeep.honk(); 
            workers.chant();
            jeep.chant(); 
            peer.crossTheRoad(); 
            System.out.println("\n[\033[3m "+peer.name+" went to back up the driver because she is a paralegal \033[0m ]"); 
            System.out.println("[\033[3m After Ju intervened with the commotion, sh e catched the last bus trip\033[0m ]"); 
            peer.rideTheVehicle(byahe); 
            System.out.println("\n[ \033[3m The bus reached its last stop for the d ay! \033[0m ] \n"); 
            byahe.busStation(); 
            byahe.unloadPassenger(); 
            byahe.unloadPassenger(); 
    } 
}
   