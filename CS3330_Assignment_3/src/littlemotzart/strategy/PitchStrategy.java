package littlemotzart.strategy;

/**
 * Interface for defining different pitch modification strategies.
 * Implementing classes specify how a note's pitch should be modified.
 */
public interface PitchStrategy {

    /**
     * Modifies the pitch of the given MIDI note.
     *
     * @param note the original MIDI note number
     * @return the modified MIDI note number
     */
    int modifyPitch(int note);

} // end PitchStrategy