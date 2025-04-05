package littlemotzart.factory;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	/**
	 * Creates and returns a LegatoMidiEventFactory
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new LegatoMidiEventFactory();
	}//end createFactory
	
}//end LegatoMidiEventFactoryAbstract