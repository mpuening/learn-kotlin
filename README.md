Learn Kotlin
=============

This project contains code to learn Kotlin (with a nod towards Spring Boot development).

## Eclipse IDE Setup

For those that prefer Eclipse, JetBrains does make an Eclipse plug-in, but it
does not get the love it deserves (perhaps for obvious reasons on JetBrains'
part). The internet is full of complaints about people not getting the plug-in
to get to work properly. Here is my findings from my journey using the plug-in:

1. Make sure you **use a version of Eclipse** that is compatible with the plug-in.
Check this [website](https://marketplace.eclipse.org/content/kotlin-plugin-eclipse).
Look at the list of supported Eclipse versions and use one of those. JetBrains is
usually a version or two behind, so just get used to not using the latest and
greatest version of Eclipse. Once you have a supported version of Eclipse, you
can install the Kotlin plug-in from the **Eclipse Marketplace**.
2. Configure the global Kotlin preferences as follows: **Do NOT use the experimental**
incremental compiler. Use the standard Kotlin style guide. **Set your JVM Target**
to the appropriate value for your project (e.g. 11 for this project).
**Set the JDK Home** to the Java compiler you want to use
(e.g. /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home)
**Set optional compiler options** for your projects (e.g. spring and all-open). The
JVM Target and JDK Home properties are most important to set. I find that when
not set or set improperly, the Kotlin project will not build within Eclipse.
3. **Import this project as a Maven project.** Once imported, make sure the
**Kotlin nature** is configured for the project. I have noticed on a few occasions that adding
the Kotlin nature does not work on the first time. If this happens, Eclipse sometimes
needs a kick in the butt. So either remove the nature and add it again, and perhaps even
restart Eclipse.
4. **Verify that test cases and the application can be run from Eclipse.**

The following versions worked for me on a Mac:

* Eclipse 2020-6 (4.16) [Download](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-ide-enterprise-java-developers)
* Kotlin plug-in 0.8.21
* Kotlin 1.4.21

With the above setup, developing with Kotlin is about 80% of what developing with Java is like.
Code completion and debugging work, but other niceties do not. For example, hints to fix code
by clicking the light bulb in the editor gutter are not available. Ctrl-Shift-O to organize imports
does not work; one has to right click the editor window to access the feature from the Source option.
If you are fan of IDE re-factoring, you are out of luck with this plug-in.

I still do not understand why I need to specify a JDK Home in the Kotlin Compiler preferences when
Eclipse knows about at least one. Sure, I might want to specify an override, but why not have a default?
To have a fresh installation of the plug-in be a "broken" state is unacceptable.


