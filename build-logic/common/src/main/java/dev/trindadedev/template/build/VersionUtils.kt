package dev.trindadedev.template.build

@SuppressWarnings("unused")
object VersionUtils {
  const val versionCode = 1
  const val version = "1.0.0"

  val versionName by lazy {
    if (CI.isCiBuild && CI.branchName != "main") {
      "$version-${CI.branchName}@${CI.commitHash}"
    } else version
  }
}
