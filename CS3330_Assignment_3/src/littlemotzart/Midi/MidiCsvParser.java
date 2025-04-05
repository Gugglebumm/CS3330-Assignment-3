package littlemotzart.Midi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.ShortMessage;

public class MidiCsvParser {
	
	/**
	 * Parses each line of the received csv file,
	 * splitting the lines with commas and creating 
	 * MidiEvent objects from the information in each
	 * line before adding it to an ArrayList which
	 * is to be returned
	 * @param filePath The file path to the csv file
	 * to be parsed
	 * @return A MidiEventData ArrayList with a
	 * MidiEventData object for every line in the
	 * csv file
	 */
	public static List<MidiEventData> parseCsv(String filePath) {
		
		List<MidiEventData> midiEvents = new ArrayList<MidiEventData>();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			String line;
			
			while((line = br.readLine()) != null) {
				String[] parts = line.split(",");
								
				int startEndTick = Integer.parseInt(parts[0]);
				String eventType = parts[1].trim();
                int channel = Integer.parseInt(parts[2]);
                int note = Integer.parseInt(parts[3]);
                int velocity = Integer.parseInt(parts[4]);
                int instrument = Integer.parseInt(parts[5]);

                int noteOnOff = -1;
                if (eventType.equals("Note_on_c")) {
                    noteOnOff = (velocity == 0) ? ShortMessage.NOTE_OFF : ShortMessage.NOTE_ON;
                } else if (eventType.equals("Note_off_c")) {
                    noteOnOff = ShortMessage.NOTE_OFF;
                }//end else if
	                
	            midiEvents.add(new MidiEventData(startEndTick, velocity, note, channel, instrument, noteOnOff));
			}//end while
		}//end try
		catch (Exception e) {
			e.printStackTrace();
		}//end catch
		
		return midiEvents;
	}//end parseCsv

}
