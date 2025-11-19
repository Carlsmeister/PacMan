# PacMan Game 🎮

A classic PacMan arcade game implementation built with Java Swing. Navigate through the maze, collect dots, avoid ghosts, and rack up points in this nostalgic recreation of the timeless classic.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-blue)

## Features

- 🕹️ **Classic Gameplay**: Control PacMan with arrow keys through a maze filled with dots
- 👻 **Four Ghost Enemies**: Red, Pink, Orange, and Blue ghosts with autonomous movement AI
- 🎯 **Score Tracking**: Earn 10 points for each dot collected
- ❤️ **Lives System**: Start with 3 lives - avoid the ghosts or lose a life
- ⏸️ **Pause Functionality**: Press 'P' to pause/resume the game
- 🔄 **Level Progression**: Complete the maze to advance to the next level
- 🎨 **Retro Graphics**: Authentic pixel art sprites for PacMan and ghosts

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line tools

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/Carlsmeister/PacMan.git
cd PacMan
```

### Running the Game

#### Using an IDE (IntelliJ IDEA)

1. Open the project in IntelliJ IDEA
2. Locate `src/Main.java`
3. Right-click on the file and select "Run 'Main.main()'"

#### Using Command Line

```bash
# Compile the Java files
javac src/*.java

# Run the game
java -cp src Main
```

## How to Play

### Controls

| Key | Action |
|-----|--------|
| ↑ | Move Up |
| ↓ | Move Down |
| ← | Move Left |
| → | Move Right |
| P | Pause/Resume |

### Gameplay

1. **Objective**: Collect all the white dots in the maze while avoiding the four colored ghosts
2. **Scoring**: Each dot is worth 10 points
3. **Lives**: You start with 3 lives. Contact with a ghost costs one life
4. **Game Over**: The game ends when all lives are lost. Press any key to restart
5. **Level Complete**: Collecting all dots loads a new level with reset positions

### Tips

- Plan your route to avoid getting cornered by ghosts
- Use the maze walls strategically to escape ghosts
- Watch the ghost movement patterns to predict their paths

## Project Structure

```
PacMan/
├── src/
│   ├── Main.java           # Application entry point
│   ├── MainFrame.java      # JFrame window setup
│   ├── PacMan.java         # Main game logic and rendering
│   ├── Block.java          # Entity class (PacMan, ghosts, walls)
│   ├── *.png               # Game sprites and assets
│   └── ...
├── .idea/                  # IntelliJ IDEA configuration
├── PacMan.iml             # IntelliJ module file
└── .gitignore
```

## Game Architecture

- **Main.java**: Entry point that initializes the game window
- **MainFrame.java**: Sets up the JFrame with proper dimensions (608x672 pixels)
- **PacMan.java**: Core game engine handling:
  - Game loop (50ms tick rate)
  - Collision detection
  - Score and lives management
  - Rendering (Graphics2D)
  - Keyboard input handling
- **Block.java**: Represents all game entities (PacMan, ghosts, walls, food) with position, velocity, and direction properties

## Technical Details

- **Board Size**: 19 columns × 21 rows
- **Tile Size**: 32×32 pixels
- **Game Resolution**: 608×672 pixels
- **Frame Rate**: ~20 FPS (50ms refresh)
- **Ghost AI**: Random direction changes with collision avoidance

## Screenshots

The game features:
- A classic maze layout with walls and corridors
- Four distinctly colored ghosts (red, pink, orange, blue)
- Directional PacMan sprites that change based on movement
- Clean black background with white food pellets
- Score and lives display at the top

## Future Enhancements

Potential improvements for the project:
- Power pellets that allow PacMan to eat ghosts temporarily
- Different ghost AI behaviors (chase, scatter, frightened modes)
- Sound effects and background music
- High score persistence
- Multiple maze layouts
- Difficulty levels

## Contributing

Contributions are welcome! If you'd like to improve the game:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Maintainer

**Carlsmeister** - [GitHub Profile](https://github.com/Carlsmeister)

## Acknowledgments

- Inspired by the original PacMan arcade game by Namco (1980)
- Sprite assets created for this educational project
- Built as a Java Swing learning exercise

---

Enjoy the game! 🎮👾
