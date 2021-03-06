package uk.oczadly.karl.csgsi.state.components;

import com.google.gson.Gson;
import org.junit.Test;
import uk.oczadly.karl.csgsi.GSIUtil;
import static org.junit.Assert.*;

public class TeamTest {
    
    Gson gson = GSIUtil.createGsonObject().create();
    
    
    @Test
    public void testDeserializer() {
        assertEquals(Team.TERRORIST,
                gson.fromJson("\"t\"", Team.class));
    
        assertEquals(Team.TERRORIST,
                gson.fromJson("\"T\"", Team.class));
    
        assertEquals(Team.COUNTER_TERRORIST,
                gson.fromJson("\"ct\"", Team.class));
    
        assertEquals(Team.COUNTER_TERRORIST,
                gson.fromJson("\"CT\"", Team.class));
    }
    
}
