package littlemotzart.factory;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract {

	/**
	 * Creates and returns a StaccatoMidiEventFactory
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StaccatoMidiEventFactory();
	}

}//end StaccatoMidiEventFactoryAbstract
