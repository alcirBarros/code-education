package br.com.context;


import com.google.api.gax.longrunning.OperationFuture;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.retrying.RetryingFuture;
import com.google.cloud.speech.v1p1beta1.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GoogleParentApplicationTests {

	@Test
	void contextLoads() throws IOException, ExecutionException, InterruptedException {
        try (SpeechClient speechClient = SpeechClient.create()) {

            // The path to the audio file to transcribe
            String gcsUri = "gs://bucket-transcribe-001/audio-files/Amanda.mp3";

            // Builds the async long running recognize request
            RecognitionConfig config = RecognitionConfig.newBuilder()
                    .setEncoding(RecognitionConfig.AudioEncoding.MP3)
                    .setSampleRateHertz(44100)
                    .setLanguageCode("pt-BR")
                    .setModel("default")
                    .setAudioChannelCount(2)
                    .setEnableWordTimeOffsets(true)
                    .build();

            RecognitionAudio audio = RecognitionAudio.newBuilder().setUri(gcsUri).build();



            // Use non-blocking call for getting file transcription
            OperationFuture<LongRunningRecognizeResponse, LongRunningRecognizeMetadata> response = speechClient.longRunningRecognizeAsync(config, audio);



            while (!response.isDone()) {
                System.out.println("Waiting for response...");
              //demo  Thread.sleep(10000);
                speechClient.awaitTermination(10000, TimeUnit.MILLISECONDS);
            }

            List<SpeechRecognitionResult> results = response.get().getResultsList();
            System.out.printf("------------------------------------------");
            for (SpeechRecognitionResult result : results) {
                // There can be several alternative transcripts for a given chunk of speech. Just use the
                // first (most likely) one here.
                SpeechRecognitionAlternative alternative = result.getAlternativesList().get(0);
                System.out.printf(alternative.getTranscript());
            }
        }

    }
}





