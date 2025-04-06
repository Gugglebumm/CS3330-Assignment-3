package littlemotzart.strategy;

/**
 * Strategy implementation that raises the pitch of a note
 * by 2 semitones.
 */
public class HigherPitchStrategy implements PitchStrategy {

    /**
     * Modifies the given MIDI note number by raising it 2 semitones.
     *
     * @param note the original MIDI note number
     * @return the modified MIDI note number, 2 semitones higher
     */
    @Override
    public int modifyPitch(int note) {
        return note + 2;  // Raise the pitch by 2 semitones
    } // end modifyPitch

} // end HigherPitchStrategy