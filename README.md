# norush20

Starcraft 2 Protoss bot written in Kotlin (JVM).

## Prerequisites

You need a Java JDK installed, of a version equal to or greater than 1.9, and your environment variable JAVA_HOME should point to this. I've tested with JDK 11.

You need Starcraft II retail installed, and you need to copy any maps you want to use to your `maps` folder in the Starcraft install location.

## Running the bot

First, acquire this codebase. The easiest way is via `git clone` (requires `git` to be installed, obviously).

Simply the `run` task with gradle. This is most easily done from the command line / terminal with the gradle wrapper:

- On Linux/Mac/Un\*x, this is `./gradlew run` from the root directory of this codebase.
- On Windows, this is `.\gradlew run` from the root folder of this codebase.

## Capabilities

Nothing yet!

## Plans

First I want to write a cannon rush bot - heavily scripted and not adaptable. Then I reckon protoss air with tempest and
oracles for vision and a prism for HT would be really strong, but that requires actual macro and decision making.
