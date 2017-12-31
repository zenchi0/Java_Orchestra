package gubenia;

/**
 *
 * @author Steve
 */
public class MusicalInstrument {
    
    public boolean isPlaying;
    public boolean isTuned;
    public String name;
    public String methodPlayed;
    
    public MusicalInstrument(String name){
       this.name = name;
       isPlaying = false;
       isTuned = false;
       
    } // end constructor
    
    public void setIsPlaying(boolean isPlaying){this.isPlaying = isPlaying;}
    
    public boolean getIsPlaying(){return isPlaying;}
    
    public void setIsTuned(boolean isTuned){this.isTuned = isTuned;}
    
    public boolean getIsTuned(){return isTuned;}
    
    public void setHowPlayed(String methodPlayed){
        this.methodPlayed = methodPlayed;
    }
    @Override
    public String toString(){return methodPlayed.toString();}
    
    public boolean tuneInstrument(){return isTuned = true;}
    
    public boolean playInstrument(){return isPlaying = true;}
    
    public String getName(){return name;}
    
} // end MusicalInstrument class
