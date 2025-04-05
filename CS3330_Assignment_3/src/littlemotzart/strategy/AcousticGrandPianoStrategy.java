package littlemotzart.strategy;

import javax.sound.midi.*;

public class AcousticGrandPianoStrategy implements InstrumentStrategy {
	
    @Override
    public void applyInstrument(Track track, int channel) {
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 0, 0);  // Acoustic Grand Piano
            track.add(new MidiEvent(message, 0));
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }//end catch
    }//end applyInstrument
    
}//end AcousticGrandPianoStrategy
