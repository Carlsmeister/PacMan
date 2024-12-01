import java.awt.*;



public class Block {

    PacMan pacMan;

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Image image;

    protected int startX;
    protected int startY;
    protected char direction = 'U';
    protected int velocityX = 0;
    protected int velocityY = 0;


    public Block(Image image, int x, int y, int width, int height, PacMan pacMan) {
        this.pacMan = pacMan;
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.startX = x;
        this.startY = y;

    }

    public void updateDirection(char direction) {
        char prevDirection = this.direction;
        this.direction = direction;
        updateVelocity();
        this.x += this.velocityX;
        this.y += this.velocityY;

        for (Block wall : pacMan.walls) {
            if (pacMan.collision(this, wall)) {
                this.x -= this.velocityX;
                this.y -= this.velocityY;
                this.direction = prevDirection;
                updateVelocity();
            }
        }
    }

    public void updateVelocity() {
        if (this.direction == 'U') {
            this.velocityX = 0;
            this.velocityY = -pacMan.tileSize / 4;
        } else if (this.direction == 'D') {
            this.velocityX = 0;
            this.velocityY = pacMan.tileSize / 4;
        }
        else if (this.direction == 'L') {
            this.velocityX = -pacMan.tileSize / 4;
            this.velocityY = 0;
        }
        else if (this.direction == 'R') {
            this.velocityX = pacMan.tileSize / 4;
            this.velocityY = 0;
        }
    } 

    public void reset() {
        this.x = this.startX;
        this.y = this.startY;
    }
}
