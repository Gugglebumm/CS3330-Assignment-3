package littlemotzart.strategy;

public class HigherPitchStrategy implements PitchStrategy {
	
    @Override
    public int modifyPitch(int note) {
        return note + 2;  // Raise the pitch by 2 semitones
    }//end modifyPitch
    
}//end HigherPitchStrategy
