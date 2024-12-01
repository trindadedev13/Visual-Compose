package dev.trindadedev.template.build

import java.io.File

object CI {

  /** The short commit hash. */
  val commitHash by lazy {
    val sha = System.getenv("GITHUB_SHA") ?: return@lazy ""
    shortSha(sha)
  }

  /** Name of the current branch. */
  val branchName by lazy {
    System.getenv("GITHUB_REF_NAME") ?: "dev" // by default, 'dev'
  }

  /** Whether the current build is a CI build. */
  val isCiBuild by lazy {
    "true" == System.getenv("CI") 
  }

  private fun shortSha(sha: String): String {
    return ProcessBuilder("git", "rev-parse", "--short", sha)
      .directory(File("."))
      .redirectErrorStream(true)
      .start()
      .inputStream
      .bufferedReader()
      .readText()
      .trim()
  }
}
