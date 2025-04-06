package littlemotzart.strategy;

/**
 * Strategy implementation that lowers the pitch of a note
 * by 2 semitones.
 */
public class LowerPitchStrategy implements PitchStrategy {

    /**
     * Modifies the given MIDI note number by lowering it 2 semitones.
     *
     * @param note the original MIDI note number
     * @return the modified MIDI note number, 2 semitones lower
     */
    @Override
    public int modifyPitch(int note) {
        return note - 2;  // Lower the pitch by 2 semitones
    } // end modifyPitch

} // end LowerPitchStrategy