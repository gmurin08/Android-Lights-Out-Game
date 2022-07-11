# Android-Lights-Out-Game

An Android app that uses MVC architecture to implement a simple game

### The Model

The model consists of a `LightsOutGame` class. The class contains an array of row and column elements, containing states of either 0 or 1 to signify the controller to tell the view to either light up or turn off a particular grid element on the screen. The user wins the game when all grid elements are in the 'off' state.

### The View

The view consists of 9 grid style buttons and a 'New Game' button placed near the bottom of the screen. These elements use click callbacks with logic defined within the controller to dictate what each button does when pressed by the user. 

### The Controller

