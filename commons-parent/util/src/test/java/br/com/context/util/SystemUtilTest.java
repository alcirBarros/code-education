package br.com.context.util;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.File;
import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.Test;

public class SystemUtilTest {

//  @Test
//  public void givenSystemUtilsClass_whenCalledgetJavaHome_thenCorrect() {
//    assertThat(SystemUtils.getJavaHome()).isEqualTo(new File("/usr/lib/jvm/java-8-oracle/jre"));
//  }

//  @Test
//  public void givenSystemUtilsClass_whenCalledgetUserHome_thenCorrect() {
//    assertThat(SystemUtils.getUserHome()).isEqualTo(new File("/home/travis"));
//  }

  @Test
  public void givenSystemUtilsClass_whenCalledisJavaVersionAtLeast_thenCorrect() {
    assertThat(SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_RECENT)).isTrue();
  }
}
