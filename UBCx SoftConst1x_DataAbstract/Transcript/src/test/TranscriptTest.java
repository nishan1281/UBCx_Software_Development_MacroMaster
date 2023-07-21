package test;

import model.Transcript;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TranscriptTest {
    private Transcript testTranscript;

    @BeforeEach
    public void setUp(){
        testTranscript = new Transcript("Student Name", 1000);
        //TODO: write new values in testTranscript constructor
    }

    @Test
    public void testTemplate(){
        //TODO: write tests for Transcript methods
    }
}
