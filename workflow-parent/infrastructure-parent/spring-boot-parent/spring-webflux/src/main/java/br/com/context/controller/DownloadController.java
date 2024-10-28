//package br.com.context;
//
//@RestController
//@RequestMapping("/api")
//public class DownloadController {
//  private final CsvWriterService csvWriterService;
//
//  public DownloadController(CsvWriterService csvWriterService){
//    this.csvWriterService = csvWriterService;
//  }
//
//  @GetMapping(value = "/download")
//  @ResponseBody
//  public ResponseEntity<Mono<Resource>> downloadCsv() {
//    String fileName = String.format("%s.csv", RandomStringUtils.randomAlphabetic(10));
//    return ResponseEntity.ok()
//        .header(HttpHeaders.CONTENT_DISPOSITION,  "attachment; filename=" + fileName)
//        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE)
//        .body(csvWriterService.generateCsv()
//                  .flatMap(x -> {
//                    Resource resource = new InputStreamResource(x);
//                    return Mono.just(resource);
//                  }));
//  }
//
//}