package littlemotzart.Midi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MidiCsvParser {
	
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

                int noteOnOff;
                if(eventType.equals("Note_on_c")) {
                	noteOnOff = 1;
                }//end if
                else {
                	noteOnOff = 0;
                }//end else
	                
	            midiEvents.add(new MidiEventData(startEndTick, velocity, note, channel, instrument, noteOnOff));
			}//end while
		}//end try
		catch (Exception e) {
			e.printStackTrace();
		}//end catch
		
		return midiEvents;
	}//end parseCsv

}
