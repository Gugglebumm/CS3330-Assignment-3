package littlemotzart.strategy;

import javax.sound.midi.*;

public class TrumpetStrategy implements InstrumentStrategy {
	
    @Override
    public void applyInstrument(Track track, int channel) {
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 56, 0);  // Trumpet
            track.add(new MidiEvent(message, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }//end applyInstrument
    
}//end TrumpetStrategy
