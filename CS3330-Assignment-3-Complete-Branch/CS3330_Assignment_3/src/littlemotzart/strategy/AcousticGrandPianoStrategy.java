package littlemotzart.strategy;

import javax.sound.midi.*;

/**
 * Strategy implementation that applies the Acoustic Grand Piano instrument
 * to a given MIDI track.
 */
public class AcousticGrandPianoStrategy implements InstrumentStrategy {

    /**
     * Applies the Acoustic Grand Piano (program number 0) instrument to the specified
     * MIDI track on the given channel.
     *
     * @param track the MIDI track to apply the instrument to
     * @param channel the MIDI channel on which to apply the instrument
     */
    @Override
    public void applyInstrument(Track track, int channel) {
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 0, 0);  // Acoustic Grand Piano
            track.add(new MidiEvent(message, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        } // end catch
    } // end applyInstrument

} // end AcousticGrandPianoStrategy
