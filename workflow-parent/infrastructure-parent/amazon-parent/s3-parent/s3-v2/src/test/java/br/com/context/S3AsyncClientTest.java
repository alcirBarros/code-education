package br.com.context;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.boot.test.context.SpringBootTest;
import software.amazon.awssdk.core.ResponseBytes;
import software.amazon.awssdk.core.async.AsyncResponseTransformer;
import software.amazon.awssdk.services.s3.S3AsyncClient;
import software.amazon.awssdk.services.s3.model.Bucket;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;

@SpringBootTest
public class S3AsyncClientTest {

  private static final String BUCKET_NAME = "a205451-br-services-ci-us-east-1";

  private S3AsyncClient s3AsyncClient;

  @BeforeEach
  void setUp() {
    s3AsyncClient = mock(S3AsyncClient.class);
  }

  @Test
  void test01() throws ExecutionException, InterruptedException {
    Bucket build1 = Bucket.builder().name("Bucket-001").build();
    ListBucketsResponse build = ListBucketsResponse.builder().buckets(build1).build();
    CompletableFuture<ListBucketsResponse> response = CompletableFuture.completedFuture(build);
    when(s3AsyncClient.listBuckets()).thenReturn(response);

    CompletableFuture<ListBucketsResponse> listBucketsResponseCompletableFuture = s3AsyncClient.listBuckets();
    ListBucketsResponse listBucketsResponse = listBucketsResponseCompletableFuture.get();
    List<Bucket> buckets = listBucketsResponse.buckets();
    System.out.println(buckets);
  }

  @Test
  void test02() {
    byte[] bytes = "file_content".getBytes(StandardCharsets.UTF_8);
    InputStream stream = new ByteArrayInputStream(bytes);
    ResponseBytes<String> fromInputStream = ResponseBytes.fromInputStream("file_content", stream);
    CompletableFuture<ResponseBytes<String>> response = CompletableFuture.completedFuture(fromInputStream);
    when(s3AsyncClient.getObject(any(GetObjectRequest.class), ArgumentMatchers.<AsyncResponseTransformer<GetObjectResponse, ResponseBytes<String>>>any())).thenReturn(response);


    GetObjectRequest request = GetObjectRequest.builder().bucket(BUCKET_NAME).key("s1000.xml").build();
    CompletableFuture<ResponseBytes<GetObjectResponse>> object = s3AsyncClient.getObject(request, AsyncResponseTransformer.toBytes());
    System.out.println(object);
  }
}
