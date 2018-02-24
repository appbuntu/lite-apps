package com.chimbori.liteapps;

import com.chimbori.FilePaths;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Generates the library JSON file, updates tags.json, and reformat it.
 */
public class LibraryValidator {
  @Test
  public void testTagsJSONIsWellFormedAndReformat() throws IOException {
    TestHelpers.assertJsonIsWellFormedAndReformat(FilePaths.LITE_APPS_TAGS_JSON);
  }

  @Test
  public void testUpdateTagsJSON() {
    try {
      TagsCollector.updateTagsJson();
    } catch (IOException e) {
      fail(e.getMessage());
    }
  }

  @Test
  public void testLibraryDataIsGeneratedSuccessfully() throws IOException {
    LibraryGenerator.generateLibraryData();
    assertTrue(true);
  }
}
