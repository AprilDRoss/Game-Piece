package com.company;

/**
 * Created by aprilross on 7/18/17.
 */
class gamePiece {
    int positionX;
    int positionY;
    int newX;
    int newY;
    boolean frozen;
    String name;
    String color;


    public gamePiece() {
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

    public void move(int newX, int newY) {
        if (frozen != true) {
            this.positionX = newX;
            this.positionY = newY;

        }
    }

    public void freeze(boolean frozen) {

        this.frozen = true;
    }

    public void unfreeze(boolean frozen) {
        this.frozen = false;
    }

}
 public class GamePiece {
     public static void main(String[] args) {
         gamePiece Rook = new gamePiece();
         Rook.name = "Rook";
         Rook.color = "Black";
         int x = Rook.getPositionX();
         int y = Rook.getPositionY();


         System.out.println("The Rook is in the x-position" + x + "and in the y-position" + y);

         if(Rook.isFrozen()){
             System.out.println("The Rook is frozen and can't move.");
         }
         else{
             System.out.println("The Rook is not frozen and able to move.");
         }

         Rook.move(35, 25);
         System.out.println("The Rook is in x-position and y-position:" + Rook.positionX + "," + Rook.positionY);



     }
 }




