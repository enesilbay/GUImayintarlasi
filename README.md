# Minesweeper (Java Swing)

A classic **Minesweeper** game written in Java with a Swing GUI. The board is a 10x10 grid with 10 randomly placed mines, and the game ends with a win or loss message.

## Features

- 10x10 board built with `GridLayout` and custom `Btn` buttons
- Random mine placement that never overlaps
- Automatic count of neighbouring mines for every cell
- Recursive opening of empty regions
- Win and lose detection with dialog messages (via `JOptionPane`)
- Mouse-driven gameplay using `MouseListener`

## Project Structure

```
src/
├── MayinTarlasi/Main.java          # Entry point
├── MayinTarlasi/MayinTarlasi.java  # Game logic and board setup
└── MayinTarlasi/Btn.java           # Custom cell button (mine flag, neighbour count)
```

## Getting Started

**Prerequisites:** JDK 11 or newer.

```bash
git clone https://github.com/enesilbay/GUImayintarlasi.git
cd GUImayintarlasi/src
javac MayinTarlasi/*.java
java MayinTarlasi.Main
```

You can also import the folder into Eclipse as an existing project and run `Main`.

## How to Play

Left-click a cell to open it. Numbers show how many mines touch that cell. Open every safe cell to win; opening a mine ends the game.

## License

This project was developed for learning purposes.
