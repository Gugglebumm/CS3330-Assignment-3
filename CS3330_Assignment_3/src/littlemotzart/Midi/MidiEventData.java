package littlemotzart.Midi;

public class MidiEventData {
	
	private int startEndTick, velocity, note, channel, noteOnOff;
	private int instrument;
	
	/**
	 * Constructor for MidiEventData objects which initializes the 
	 * startEndTick, velocity, note, channel, instrument, and
	 * noteOnOff variables
	 * @param startEndTick The received startEndTick of the 
	 * MidiEventData
	 * @param velocity The received velocity of the MidiEventData
	 * @param note The received note of the MidiEventData
	 * @param channel The received channel of the MidiEventData
	 * @param instrument The received instrument of the 
	 * MidiEventData
	 * @param noteOnOff The received noteOnOff of the 
	 * MidiEventData
	 */
	public MidiEventData(int startEndTick, int velocity, int note, int channel, int instrument, int noteOnOff) {
		this.startEndTick = startEndTick;
		this.velocity = velocity;
		this.note = note;
		this.channel = channel;
		this.instrument = instrument;
		this.noteOnOff = noteOnOff;
	}//end MidiEventData

	/**
	 * Retrieves the startEndTick of the MidiEventData
	 * @return the startEndTick
	 */
	public int getStartEndTick() {
		return startEndTick;
	}//end getStartEndTick

	/**
	 * Sets the startEndTick of the MidiEventData
	 * @param startEndTick The startEndTick to be
	 * assigned to the MidiEventData
	 */
	public void setStartEndTick(int startEndTick) {
		this.startEndTick = startEndTick;
	}//end setStartEndTick

	/**
	 * Retrieves the velocity of the MidiEventData
	 * @return the velocity
	 */
	public int getVelocity() {
		return velocity;
	}//end getVelocity

	/**
	 * Sets the velocity of the MidiEventData
	 * @param velocity The velocity to be
	 * assigned to the MidiEventData
	 */
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}//end setVelocity

	/**
	 * Retrieves the note of the MidiEventData
	 * @return the note
	 */
	public int getNote() {
		return note;
	}//end getNote

	/**
	 * Sets the note of the MidiEventData
	 * @param note The note to be
	 * assigned to the MidiEventData
	 */
	public void setNote(int note) {
		this.note = note;
	}//end setNote

	/**
	 * Retrieves the channel of the MidiEventData
	 * @return the channel
	 */
	public int getChannel() {
		return channel;
	}//end getChannel

	/**
	 * Sets the channel of the MidiEventData
	 * @param channel The channel to be
	 * assigned to the MidiEventData
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}//end setChannel

	/**
	 * Retrieves the noteOneOff of the MidiEventData
	 * @return the noteOnOff
	 */
	public int getNoteOnOff() {
		return noteOnOff;
	}//end getNoteOnOff

	/**
	 * Sets the noteOnOff of the MidiEventData
	 * @param noteOnOff The noteOnOff to be
	 * assigned to the MidiEventData
	 */
	public void setNoteOnOff(int noteOnOff) {
		this.noteOnOff = noteOnOff;
	}//end setNoteOnOff

	/**
	 * Retrieves the instrument of the MidiEventData
	 * @return the instrument
	 */
	public int getInstrument() {
		return instrument;
	}//end getInstrument

	/**
	 * Sets the instrument of the MidiEventData
	 * @param instrument The instrument to be
	 * assigned to the MidiEventData
	 */
	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}//end setInstrument

	/**
	 * Prints the event data of the MidiEventData object
	 */
	@Override
	public String toString() {
		return "MidiEventData [startEndTick=" + startEndTick + ", velocity=" + velocity + ", note=" + note
				+ ", channel=" + channel + ", noteOnOff=" + noteOnOff + ", instrument=" + instrument + "]";
	}
	
	
	
}//end MidiEventData
