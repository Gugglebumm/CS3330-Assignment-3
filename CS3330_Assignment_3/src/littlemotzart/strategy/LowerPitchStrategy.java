package littlemotzart.strategy;

public class LowerPitchStrategy implements PitchStrategy {
	
    @Override
    public int modifyPitch(int note) {
        return note - 2;  // Lower the pitch by 2 semitones
    }//end modifyPitch
    
}//end LowerPitchStrategy
