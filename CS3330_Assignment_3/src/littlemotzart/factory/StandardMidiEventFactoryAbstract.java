package littlemotzart.factory;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	/**
	 * Creates and returns a StandardMidiEventFactory
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StandardMidiEventFactory();
	}//end createFactory

}//end StandardMidiEventFactoryAbstract
