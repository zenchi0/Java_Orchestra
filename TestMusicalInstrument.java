package gubenia;
/**
 *
 * @author Steve
 */
import java.util.ArrayList;

public class TestMusicalInstrument {

    public static void main(String[] args) {
       ArrayList<MusicalInstrument> instruments = new ArrayList<>();
       
       MusicalInstrument i1 = new Woodwind("oboe");
       MusicalInstrument i2 = new Brass("tuba");
       MusicalInstrument i3 = new Strings("violin");
       MusicalInstrument i4 = new Percussion("drum");
       
       instruments.add(i1);
       instruments.add(i2);
       instruments.add(i3);
       instruments.add(i4);
       
       System.out.println(instruments.size() + " instruments created \n");
       System.out.print("They are: ");
       for (int i = 0; i < instruments.size(); i++){
           System.out.print(((MusicalInstrument)instruments.get(i)).getName()
                   + " ");
          
       } // end for
       
       System.out.println("\n \nThe status of each intrument is:");

        for (int i = 0; i < instruments.size(); i++){
           System.out.print("\n" + 
                   ((MusicalInstrument)instruments.get(i)).getName());
           System.out.print("\nPlaying? " + 
                   ((MusicalInstrument)instruments.get(i)).getIsPlaying());
           System.out.print("\nTuned? " + 
                   ((MusicalInstrument)instruments.get(i)).getIsTuned());
           System.out.print("\nMethod to Play: " + 
                   ((MusicalInstrument)instruments.get(i)).toString() + "\n");
       } // end for
       
        System.out.println("\nTuning all instruments.");
        
        for (int i = 0; i < instruments.size(); i++){
            ((MusicalInstrument)instruments.get(i)).tuneInstrument();
        } // end for
        
        
        System.out.println("Checking tuning of all instruments.");
        
         for (int i = 0; i < instruments.size(); i++){
           System.out.print("\n" + 
                   ((MusicalInstrument)instruments.get(i)).getName());
           System.out.println("\nTuned? " + 
                   ((MusicalInstrument)instruments.get(i)).getIsTuned());
         } // end for
         
         System.out.println("Starting to play each intrument.");
         
         for (int i = 0; i < instruments.size(); i++){
            ((MusicalInstrument)instruments.get(i)).playInstrument();
        } // end for
         
         System.out.println("\nThe status of all instruments is now:");
         
         for (int i = 0; i < instruments.size(); i++){
           System.out.print("\n" + 
                   ((MusicalInstrument)instruments.get(i)).getName());
           System.out.print("\nPlaying? " + 
                   ((MusicalInstrument)instruments.get(i)).getIsPlaying());
           System.out.print("\nTuned? " + 
                   ((MusicalInstrument)instruments.get(i)).getIsTuned());
           System.out.print("\nMethod to Play: " + 
                   ((MusicalInstrument)instruments.get(i)).toString() + "\n");
       } // end for
         
    } //end main method
    
} // end TestMusicalInstrument class
