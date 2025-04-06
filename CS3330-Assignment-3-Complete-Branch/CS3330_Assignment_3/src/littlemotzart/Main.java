package littlemotzart;

import javax.sound.midi.*;
import littlemotzart.factory.*;
import littlemotzart.strategy.AcousticGrandPianoStrategy;
import littlemotzart.strategy.ElectricBassGuitarStrategy;
import littlemotzart.strategy.HigherPitchStrategy;
import littlemotzart.strategy.InstrumentStrategy;
import littlemotzart.strategy.LowerPitchStrategy;
import littlemotzart.strategy.PitchStrategy;
import littlemotzart.strategy.TrumpetStrategy;

import java.util.List;

import javax.sound.midi.Sequence;
import javax.sound.midi.Track;

import littlemotzart.Midi.MidiCsvParser;
import littlemotzart.Midi.MidiEventData;

public class Main {

	public static void main(String[] args) {
		
		try {
			/*
			// Choose a factory (Standard, Legato, Staccato)
            MidiEventFactoryAbstract factoryAbstract = new StandardMidiEventFactory();
            // Uncomment one of the lines below to switch between factories
            // MidiEventFactoryAbstract factoryAbstract = new LegatoMidiEventFactory();
            // MidiEventFactoryAbstract factoryAbstract = new StaccatoMidiEventFactory();

            // Create a Sequence (use Sequence instead of MidiSequence)
            Sequence sequence = new Sequence(Sequence.PPQ, 24);  // PPQ = Pulses Per Quarter Note (standard value)

            // Create a track within the sequence
            Track track = sequence.createTrack();

            // Create NoteOn and NoteOff events using the factory
            MidiEvent noteOn = factoryAbstract.createNoteOn(0, 60, 93, 0); // Tick: 0, Note: 60 (Middle C), Velocity: 93
            track.add(noteOn);
            System.out.println("Created " + noteOn.getMessage());

            MidiEvent noteOff = factoryAbstract.createNoteOff(500, 60, 0); // Tick: 500, Note: 60 (Middle C)
            track.add(noteOff);
            System.out.println("Created " + noteOff.getMessage());

            // Here, you can save the sequence to a file or play it using a MidiPlayer
            // For example: Saving to a MIDI file
            MidiSystem.write(sequence, 1, new java.io.File("output.mid"));
			 */
			
			List<MidiEventData> midiEvents = MidiCsvParser.parseCsv("./files/mystery_song.csv");
			Sequence sequence = new Sequence(Sequence.PPQ, 384);
			Track track = sequence.createTrack();
			
//			for(MidiEventData m : midiEvents) {
//				System.out.println(m);
//			}//end for
			
			MidiEventFactoryAbstract factoryAbstract = new StandardMidiEventFactoryAbstract();
            //MidiEventFactoryAbstract factoryAbstract = new LegatoMidiEventFactoryAbstract();
            //MidiEventFactoryAbstract factoryAbstract = new StaccatoMidiEventFactoryAbstract();
			
			MidiEventFactory factory = factoryAbstract.createFactory();
			
			InstrumentStrategy instrumentStrat = new ElectricBassGuitarStrategy();
			instrumentStrat.applyInstrument(track, 0);
			instrumentStrat = new AcousticGrandPianoStrategy();
			instrumentStrat.applyInstrument(track, 1);
			
			PitchStrategy pitchStrat = new HigherPitchStrategy();
			//PitchStrategy pitchStrat = new LowerPitchStrategy();
			
			for (MidiEventData event : midiEvents) {
				int modifiedNote = pitchStrat.modifyPitch(event.getNote());
				//modifiedNote = pitchStrat.modifyPitch(modifiedNote);
				
				if(event.getNoteOnOff() == ShortMessage.NOTE_ON) {
					track.add(factory.createNoteOn(event.getStartEndTick(), modifiedNote, 
							  event.getVelocity(), event.getChannel()));
				}
				else {
					track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel()));
				}
			}
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.setSequence(sequence);
			sequencer.start();
			
			while (sequencer.isRunning() | sequencer.isOpen()) {
				Thread.sleep(100);
			}
			Thread.sleep(500);
			sequencer.close();
			
		}//end try
		catch (Exception e) {
			e.printStackTrace();
		}//end catch
		finally {
			System.out.println("Done");
		}//end finally

	}//end main
}//end Main
