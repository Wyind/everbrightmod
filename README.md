# Everbright
This is the repo for the Everbright mod, Created with MCreator.

 ## 📥 Installation

The link to the modrinth page is here: https://modrinth.com/project/the-everbright-mod

# 🛠️ Developer Guide
Building from sources
Everbright uses a typical Gradle project structure and can be compiled by simply running the default build task. The build artifacts (typical mod binaries, and their sources) can be found in the build/libs directory.

## Requirements
I recommend using a package manager (such as SDKMAN) to manage toolchain dependencies and keep them up to date. For many Linux distributions, these dependencies will be standard packages in your software repositories.

OpenJDK 21
We recommend using the Eclipse Temurin distribution, as it's known to be high quality and to work without issues.
Gradle 8.6.x (optional)
The Gradle wrapper is provided in this repository can be used instead of installing a suitable version of Gradle yourself. However, if you are building many projects, you may prefer to install it yourself through a suitable package manager as to save disk space and to avoid many different Gradle daemons sitting around in memory.
Typically, newer versions of Gradle will work without issues, but the build script is only tested against the version specified by the wrapper script.
