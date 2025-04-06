package littlemotzart.strategy;

import javax.sound.midi.*;

/**
 * Strategy implementation that applies the Electric Bass Guitar instrument
 * to a given MIDI track.
 */
public class ElectricBassGuitarStrategy implements InstrumentStrategy {

    /**
     * Applies the Electric Bass Guitar (program number 33) instrument to the specified
     * MIDI track on the given channel.
     *
     * @param track the MIDI track to apply the instrument to
     * @param channel the MIDI channel on which to apply the instrument
     */
    @Override
    public void applyInstrument(Track track, int channel) {
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 33, 0);  // Electric Bass Guitar
            track.add(new MidiEvent(message, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        } // end catch
    } // end applyInstrument

} // end ElectricBassGuitarStrategy