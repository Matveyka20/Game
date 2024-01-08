package Ceminar;

public class Vector2 {
    int X, Y;

    public Vector2(int X, int Y){
        this.X = X;
        this.Y = Y;
    }

    public float rangeToEnemy(Vector2 posEnemy){
        double distance = Math.sqrt(Math.pow(posEnemy.Y - Y,2) + Math.pow(posEnemy.X - X,2));
        return (float)distance;
    }
}
