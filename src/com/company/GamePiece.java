package com.company;

/**
 * Created by aprilross on 7/18/17.
 */
public class GamePiece {
    int positionX;
    int positionY;
    int deltaX;
    int deltaY;
    boolean frozen;
    String name;
    String color;


    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getName() {
        return name;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }

    public void move(int deltaX, int deltaY)
        this.positionX += deltaX;
        this.positionY += deltaY;

    }

     public void freeze(boolean frozen){
        this.frozen = true;
     }

     public void unfreeze(boolean frozen){
         this.frozen = false;
     }

     public static void main (String[] args){
         GamePiece piece = new GamePiece();

         piece.getPositionX();
         piece.getPositionY();
         System.out.println("The piece is in x-position and y-position:" + positionX "," + positionY);

     }
}


