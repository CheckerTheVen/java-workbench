# Java - Workbench

*configured for Java 21.0.1*

*developed in IntelliJ IDEA Community 2024.1*

This project merly serves for
practicing programming with Java.

---

## Prototype *Tinygame*

*Tinygame* is a prototype for a simple game.
It allows a player to explore a 2D rendered world.

Goal of *Tinygame* is to create a stable and performant application
that can be used for further development later on. *Tinygame* is **not**
supposed to become its own standalone game, but rather introduce
the basic logic of a game's functionality to this application.

*Tinygame* can be found in the `tinygame` package.

### Current development status

#### Implemented:

- *Tinygame* is able to load assets and render a level.

> A *level* is the field where an entity (i. e. the player)
> can move around and interact with.

- *Tinygame* produces a window that simply consists
of a few transparent layers, on which different
visuals of the game are rendered.

- *Tinygame* can listen to keyboard interactions.

#### Under development:

- *Tinygame* is supposed to render the players position
depending on if they're moving, thus needs implementation
for handling more keyboard inputs while also clearing and
rendering the new location on the designated layer.

#### Not started:

- *Tinygame* is supposed to be introduced to the mechanic
of a so-called game-loop. This ensures that the game only
then renders when it's supposed to.

> A *game-loop* is basically a loop that only then terminates
> when the game is being closed. It makes sure that the
> component renders repeatedly in defined intervals rather
> than immediately on user input.

