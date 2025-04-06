package littlemotzart.factory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class StaccatoMidiEventFactory implements MidiEventFactory {
		
	    /**
	    * Creates a NOTE_ON MIDI event at the given tick.
	    * @param tick the time (in ticks) to play the note
	    * @param note the MIDI note value (pitch)
	    * @param velocity the note velocity (volume)
	    * @param channel the MIDI channel (instrument track)
	    * @return the MidiEvent representing the note-on message
	    * @throws InvalidMidiDataException if the message is invalid
	    */
		@Override
		public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
			
			ShortMessage message = new ShortMessage();
			message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
			return new MidiEvent(message, tick);
		}//end createNoteOn
		
		/**
		* Creates a NOTE_OFF MIDI event 120 ticks before the given tick.
		* @param tick the original time (in ticks) to stop the note
		* @param note the MIDI note value (pitch)
		* @param velocity unused velocity parameter
		* @param channel the MIDI channel
		* @return the MidiEvent representing the early note-off message
		* @throws InvalidMidiDataException if the message is invalid
		*/
		@Override
		public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
			
			ShortMessage message = new ShortMessage();
			message.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
			return new MidiEvent(message, tick - 120);// staccato shortens note duration
		}//end CreateNoteOff
		
}//end StaccatoMidiEventFactory