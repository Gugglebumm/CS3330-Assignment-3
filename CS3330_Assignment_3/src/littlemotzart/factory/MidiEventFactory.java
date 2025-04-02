package littlemotzart.factory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

public interface MidiEventFactory {
	
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	public MidiEvent createNoteOff(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;

}//end MidiEventFactory
