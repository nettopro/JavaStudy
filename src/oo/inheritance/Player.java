package oo.inheritance;

public class Player {
    public int x,y,hp = 100;

    protected Player(int x, int y){
        this.x = y;
        this.y = y;
    }

    public boolean attack(Player enemy){

        int deltaX = Math.abs(x - enemy.x);
        int deltaY = Math.abs(y - enemy.y);

        if(deltaX == 0 && deltaY == 1){
            enemy.hp -= 10;
            return true;
        } else if(deltaX == 1 && deltaY == 0){
            enemy.hp -= 10;
            return true;
        }
        return false;
    }

    public boolean walk(Direction direction){
        switch(direction){
            case NORTE:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y--;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
}
