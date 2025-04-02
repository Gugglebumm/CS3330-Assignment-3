package littlemotzart;

import java.util.List;

import littlemotzart.Midi.MidiCsvParser;
import littlemotzart.Midi.MidiEventData;

public class Main {

	public static void main(String[] args) {
		
		try {
			List<MidiEventData> midiEvents = MidiCsvParser.parseCsv("./files/mystery_song.csv");
			
			for(MidiEventData m : midiEvents) {
				System.out.println(m);
			}//end for
			
		}//end try
		catch (Exception e) {
			e.printStackTrace();
		}//end catch
		finally {
			System.out.println("Done");
		}//end finally

	}//end main
}//end Main
