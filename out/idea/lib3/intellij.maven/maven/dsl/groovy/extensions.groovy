// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package maven.dsl.groovy

class extensions {

  def extension
  /**
   * Add extension
   */
  void extension(Map attrs = [:], Closure closure) {}

  /**
   * Add extension
   */
  void extension(Map attrs) {}
}
