package littlemotzart.strategy;

import javax.sound.midi.Track;

/**
 * Interface for defining different instrument application strategies.
 * Implementing classes specify how a particular instrument is applied
 * to a MIDI track.
 */
public interface InstrumentStrategy {

    /**
     * Applies a specific instrument to the given MIDI track and channel.
     *
     * @param track the MIDI track to which the instrument will be applied
     * @param channel the MIDI channel on which to apply the instrument
     */
    void applyInstrument(Track track, int channel);

} // end InstrumentStrategy
