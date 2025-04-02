package littlemotzart.Midi;

public class MidiEventData {
	
	private int startEndTick, velocity, note, channel, noteOnOff;
	private int instrument;
	
	public MidiEventData(int startEndTick, int velocity, int note, int channel, int instrument, int noteOnOff) {
		this.startEndTick = startEndTick;
		this.velocity = velocity;
		this.note = note;
		this.channel = channel;
		this.instrument = instrument;
		this.noteOnOff = noteOnOff;
	}//end MidiEventData

	public int getStartEndTick() {
		return startEndTick;
	}//end getStartEndTick

	public void setStartEndTick(int startEndTick) {
		this.startEndTick = startEndTick;
	}//end setStartEndTick

	public int getVelocity() {
		return velocity;
	}//end getVelocity

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}//end setVelocity

	public int getNote() {
		return note;
	}//end getNote

	public void setNote(int note) {
		this.note = note;
	}//end setNote

	public int getChannel() {
		return channel;
	}//end getChannel

	public void setChannel(int channel) {
		this.channel = channel;
	}//end setChannel

	public int getNoteOnOff() {
		return noteOnOff;
	}//end getNoteOnOff

	public void setNoteOnOff(int noteOnOff) {
		this.noteOnOff = noteOnOff;
	}//end setNoteOnOff

	public int getInstrument() {
		return instrument;
	}//end getInstrument

	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}//end setInstrument

	@Override
	public String toString() {
		return "MidiEventData [startEndTick=" + startEndTick + ", velocity=" + velocity + ", note=" + note
				+ ", channel=" + channel + ", noteOnOff=" + noteOnOff + ", instrument=" + instrument + "]";
	}
	
	
	
}//end MidiEventData
