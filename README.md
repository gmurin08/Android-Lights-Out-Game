# Android-Lights-Out-Game

A simple Android app that uses MVC architecture to implement a lights out game

## Model

The model consists of a `LightsOutGame` class. The class contains an array of row and column elements, containing states of either 0 or 1 to signify the controller to tell the view to either light up or turn off a particular grid element on the screen. The user wins the game when all grid elements are in the 'off' state.
