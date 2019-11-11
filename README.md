# AndroidTaskJacker

Android Taskjacker is a Proof of Concept of android taskjacking vulnerability. The project provides an android trojan (Fake Dating App) which includes a Malicious content to exploit android taskjacking vulnerability.

**This project is for educational purposes, use it on your own risk.**

### Introduction

In Android, an application's activities run together in a stack called a Task or the back stack. The position of an activity within a task depends on a set of the activity's parameters : taskAffinity, launchMode, allowTaskReparting, etc.

Android allows activities from different applications to share the same task, and this usually happens when an application calls an activity from an other applicatiton.
But through manipulating the previously mentioned parameters we can force an activity from a malicious application to join the task of another application, or the other way around by bring an activity from an other application to join our application's task in a malicious manner.

### AndroidTaskJacker

The Taskjacker application allows you to attack an application by moving a malicious activity on the top of the target application's task by manipulating the 'taskAffinity' and 'allowTaskReparting' parameters. Our PoC application will target the testing example App named (**target**). By using the package name of the latter application (target) as a value of the malaicious activity of the trojan app taskAffinity parameter, this way when the user launchs the target app, the malicious activity which has the same UI as the target app main activity will be placed on the top of the target app's task and fool the user to enter their credentials thinking there are communicating with the legitimate app.

In order to make the malicious activity unoticed we created a broadcast receiver to listen to a system event and start the activity in the background when the broadcast is received.


### Prerequisite

- Android studio
- Android device/emulator

### Usage

- Download both the **target** and **taskjacker** android projects and load them into android studio.
- You can either install the applications on android emulator from Android studio or generate the APK files to use other android devices.
- You can customize the system event that the malicious application (**taskjacker**) is listening to in order to trigger the malicious activity. To do so modify **TheReceiver** broadcast receiver in AndroidManifest.xml. The default system event configuredd is 'android.intent.action.BOOT_COMPLETED'.

### References

- https://developer.android.com/guide/topics/manifest/activity-element
- https://www.youtube.com/watch?v=IYGwXFIYdS8&t=677s
