/*
 * Copyright 2016 liufanping@iveely.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iveely.computing.task;

import com.iveely.computing.io.IWriter;

/**
 * Writer task with a file.
 */
public class WriterTask {

  /**
   * The writer instance.
   */
  private IWriter writer;

  /**
   * The file to written.
   */
  private String file;

  /**
   * Build writer task.
   *
   * @param writer The writer instance.
   * @param file   The file to written.
   */
  public WriterTask(IWriter writer, String file) {
    this.writer = writer;
    this.file = file;
  }

  /**
   * @return the writer
   */
  public IWriter getWriter() {
    return writer;
  }

  /**
   * @param writer the writer to set
   */
  public void setWriter(IWriter writer) {
    this.writer = writer;
  }

  /**
   * @return the file
   */
  public String getFile() {
    return file;
  }

  /**
   * @param file the file to set
   */
  public void setFile(String file) {
    this.file = file;
  }
}
