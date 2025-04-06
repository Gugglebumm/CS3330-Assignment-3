package littlemotzart.strategy;

import javax.sound.midi.*;

/**
 * Strategy implementation that applies the Trumpet instrument
 * to a given MIDI track.
 */
public class TrumpetStrategy implements InstrumentStrategy {

    /**
     * Applies the Trumpet (program number 56) instrument to the specified
     * MIDI track on the given channel.
     *
     * @param track the MIDI track to apply the instrument to
     * @param channel the MIDI channel on which to apply the instrument
     */
    @Override
    public void applyInstrument(Track track, int channel) {
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 56, 0);  // Trumpet
            track.add(new MidiEvent(message, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    } // end applyInstrument

} // end TrumpetStrategy
