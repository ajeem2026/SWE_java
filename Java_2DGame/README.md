# Assignment 3: Making a Game

## Author: Abid Jeem

## Objectives

Using a game to explore ideas of inheritance, abstract classes,
dynamic dispatch, and final methods.

## Running the Code

To run the code, run `java Game`

To run the demo game, in the `demoClasses` directory, run `java -cp 
Game.jar Game`

## Design Decisions

We modified the Game to improve it from its original design.  Below, I
defend the design decisions.

### Making GamePiece Abstract

GamePiece class is inherited by each of our pieces (professor, goblin and treasure) as it defines common traits and functionality shared by all piecs. By making GamePiece abstract, these commonalities can be capitalized on by making code easier to change, extend and maintain— avoiding redundant code as well. It also allows each piece to implement its custom behavior by overriding the default behavior in abstract class while still maintaining compatibility. 

### Calling an Abstract Method

We can call the takeTurn() method on a GamePiece object and still get the desired behavior because of dynamic dispatch and polymorphism. When taketurn() is called on a GamePiece object, Java determines the object's class at runtime and dispatches the appropriate method. Even though abstract class GamePiece defines takeTurn() as abstract, each child-class piece has its own implementation— ensuring the correct method is called at runtime. This effect is known as polymorphism. 

### Choices of Final Methods

`final` modifier means field cannot be changed after object is constructed. In case of methods, if we don't want child classes to override a method— we make that method `final`. In our GamePiece class, `getXPos(), getYPos(), getImageWidht(), getCharacterWidth(), and draw()` were made `final` because these are concrete methods that do not need to be overridden. As a developer, final methods are simpler for us to understand as its behavior remains consistent through all child classes. For the compiler, it easier to optimize final methods because of its consistent implementation. 


### Adding a New Goblin

1. Create a new class named "NewGoblin" _(inheriting GamePiece)_ with its custom takeTurn() method

2. Setup a different image for the NewGoblin in your NewGoblin constructor and adjust img_width and char_width accordingly

3. Implement logic for desired movement in takeTurn() method and make sure it has the __@Override annotation__

4. In Game.java, resize GamePiece[] array to accommodate the new NewGoblin instance, and add it to the array. The declaration and allocation of your new array should like this:

`GamePiece[] pieces = new GamePiece[4];` _(Allocated memory is now 4 to account for the new piece)_

5. After initializing your newGoblin, make sure to add it to the GamePiece[] array: `pieces[3] = newGoblin;`

6. Compile the code using javac Game.java and run by executing java Game 


