package race;

import java.util.ArrayList;
import java.util.List;

class GameResult {
    static List<Recorder> getResultByEachLab(List<Recorder> recorders, int labs) {
        List<Recorder> result = new ArrayList<>();
        
        for (int i = 0; i < labs; i++) {
            Recorder recorder = new Recorder();
            for (Recorder r : recorders) {
                recorder.record(r.getRecord(i));
            }
            result.add(recorder);
        }
        return result;
    }
}

