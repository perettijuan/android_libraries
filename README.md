<h1>android_cool_coding</h1>

My own repository for cool stuffs in Android


<h3>android_sync_service_library</h3>
<p>This is a library used to execute background operations in a very simple way. It's based on the IntentService implementation of the Android SDK, with the singularity of allowing multiple requests to run in parallel. As the IntentService implementation, this Service spreads a new thread (as many as requested for every independent request) and executes the task in that thread. Once that the work is done, the client is notifyed using a ResultReceiver that is passed as parameter in the request. I will add an example of usage in some future.
<br>TODO: refactor the SyncService architecture to allow a more flexible communication between the background thread/s and the UI thread</p>

<br><br>

<h3>animation_examples</h3>
<p>Contains several examples of animations that can be used in the Android framework. These animations are based in the animations framework previous to Honeycomb release.
<br>TODO 1 : review the animations framework provided by the 4.x release and the usage of the NineOlds library.
<br> 2 : add examples for animations and transition framework introduced in Lollipop releases.</p>


<br><br>

<h3>patterns</h3>
<p>This folder contains several examples of patterns that can be applied in the development of new Android applications. It's oriented to show some helpful examples that allowed me to develop some of my work.
<br>MVP pattern example: Model View Presenter example pattern - this pattern is used to assign responsibilities properly between the View that is shown to the user, a Presenter that takes care of the logic used for showing the view and the Model that represents the business logic.
<br>Observer Pattern: an implementation of the worldwide known Gang of Four's Observer Pattern </p>


<br><br>

<h3>wearables</h3>
<p>Contains examples of wearables applications</p>

