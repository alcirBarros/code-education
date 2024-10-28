import com.amazonaws.transcribe.BidirectionalStreaming;
import org.junit.jupiter.api.*;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.transcribestreaming.TranscribeStreamingAsyncClient;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TranscribeTest {

    private static TranscribeStreamingAsyncClient client;

    @BeforeAll
    public static void setUp() throws IOException, URISyntaxException {

        Region region = Region.US_EAST_1;
        client = TranscribeStreamingAsyncClient.builder()
                .region(region)
                .build();
    }


    @Test
    @Order(1)
    public void whenInitializingAWSService_thenNotNull() {
        assertNotNull(client);
        System.out.println("Test 1 passed");
    }

    @Test
    @Order(2)
    public void bidirectional_Streaming() throws Exception {
        BidirectionalStreaming.convertAudio(client);
    }
 }
