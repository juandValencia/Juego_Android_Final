package com.example.juego_puzzle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.ArrayList;
public class Snake {
    private Bitmap bm, bm_head_down, bm_head_left, bm_head_right, bm_head_up,
            bm_body_vertical, bm_body_horizontal, bm_body_bottom_left, bm_body_bottom_right, bm_body_top_left, bm_body_top_right,
            bm_tail_up, bm_tail_down, bm_tail_right, bm_tail_left;
    private ArrayList<PartSnake> arrPartSnake = new ArrayList<>();
    private int length;
    private boolean move_left, move_right, move_up, move_down;


    public Snake(Bitmap bm, int x, int y, int length) {
        this.bm = bm;
        this.length = length;
        bm_body_bottom_left = Bitmap.createBitmap(bm, 0, 0, bm.getWidth()/14, bm.getHeight());
        bm_body_bottom_right = Bitmap.createBitmap(bm, bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_body_horizontal = Bitmap.createBitmap(bm, 2*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_body_top_left = Bitmap.createBitmap(bm, 3*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_body_top_right = Bitmap.createBitmap(bm, 4*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_body_vertical = Bitmap.createBitmap(bm, 5*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_head_down = Bitmap.createBitmap(bm, 6*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_head_left = Bitmap.createBitmap(bm, 7*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_head_right = Bitmap.createBitmap(bm, 8*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_head_up = Bitmap.createBitmap(bm, 9*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_tail_up = Bitmap.createBitmap(bm, 10*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_tail_right = Bitmap.createBitmap(bm, 11*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_tail_left = Bitmap.createBitmap(bm, 12*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        bm_tail_down = Bitmap.createBitmap(bm, 13*bm.getWidth()/14, 0, bm.getWidth()/14, bm.getHeight());
        setMove_right(true);
        arrPartSnake.add(new PartSnake(bm_head_right, x, y));
        for (int i = 1; i < length-1; i++){
            this.arrPartSnake.add(new PartSnake(bm_body_horizontal, this.arrPartSnake.get(i-1).getX()-GameView.sizeElementMap, y));
        }
        arrPartSnake.add(new PartSnake(bm_tail_right, arrPartSnake.get(length-2).getX()-GameView.sizeElementMap, arrPartSnake.get(length-2).getY()));
    }

    public void drawSnake(Canvas canvas){
        for(int i = length-1; i >= 0; i--){
            canvas.drawBitmap(arrPartSnake.get(i).getBm(), arrPartSnake.get(i).getX(), arrPartSnake.get(i).getY(), null);
        }
    }







    public Bitmap getBm() {
        return bm;
    }

    public void setBm(Bitmap bm) {
        this.bm = bm;
    }

    public Bitmap getBm_head_down() {
        return bm_head_down;
    }

    public void setBm_head_down(Bitmap bm_head_down) {
        this.bm_head_down = bm_head_down;
    }

    public Bitmap getBm_head_left() {
        return bm_head_left;
    }

    public void setBm_head_left(Bitmap bm_head_left) {
        this.bm_head_left = bm_head_left;
    }

    public Bitmap getBm_head_right() {
        return bm_head_right;
    }

    public void setBm_head_right(Bitmap bm_head_right) {
        this.bm_head_right = bm_head_right;
    }

    public Bitmap getBm_head_up() {
        return bm_head_up;
    }

    public void setBm_head_up(Bitmap bm_head_up) {
        this.bm_head_up = bm_head_up;
    }

    public Bitmap getBm_body_vertical() {
        return bm_body_vertical;
    }

    public void setBm_body_vertical(Bitmap bm_body_vertical) {
        this.bm_body_vertical = bm_body_vertical;
    }

    public Bitmap getBm_body_horizontal() {
        return bm_body_horizontal;
    }

    public void setBm_body_horizontal(Bitmap bm_body_horizontal) {
        this.bm_body_horizontal = bm_body_horizontal;
    }

    public Bitmap getBm_body_bottom_left() {
        return bm_body_bottom_left;
    }

    public void setBm_body_bottom_left(Bitmap bm_body_bottom_left) {
        this.bm_body_bottom_left = bm_body_bottom_left;
    }

    public Bitmap getBm_body_bottom_right() {
        return bm_body_bottom_right;
    }

    public void setBm_body_bottom_right(Bitmap bm_body_bottom_right) {
        this.bm_body_bottom_right = bm_body_bottom_right;
    }

    public Bitmap getBm_body_top_left() {
        return bm_body_top_left;
    }

    public void setBm_body_top_left(Bitmap bm_body_top_left) {
        this.bm_body_top_left = bm_body_top_left;
    }

    public Bitmap getBm_body_top_right() {
        return bm_body_top_right;
    }

    public void setBm_body_top_right(Bitmap bm_body_top_right) {
        this.bm_body_top_right = bm_body_top_right;
    }

    public Bitmap getBm_tail_up() {
        return bm_tail_up;
    }

    public void setBm_tail_up(Bitmap bm_tail_up) {
        this.bm_tail_up = bm_tail_up;
    }

    public Bitmap getBm_tail_down() {
        return bm_tail_down;
    }

    public void setBm_tail_down(Bitmap bm_tail_down) {
        this.bm_tail_down = bm_tail_down;
    }

    public Bitmap getBm_tail_right() {
        return bm_tail_right;
    }

    public void setBm_tail_right(Bitmap bm_tail_right) {
        this.bm_tail_right = bm_tail_right;
    }

    public Bitmap getBm_tail_left() {
        return bm_tail_left;
    }

    public void setBm_tail_left(Bitmap bm_tail_left) {
        this.bm_tail_left = bm_tail_left;
    }

    public ArrayList<PartSnake> getArrPartSnake() {
        return arrPartSnake;
    }

    public void setArrPartSnake(ArrayList<PartSnake> arrPartSnake) {
        this.arrPartSnake = arrPartSnake;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isMove_left() {
        return move_left;
    }

    public void setMove_left(boolean move_left) {
        this.setup();
        this.move_left = move_left;
    }

    public boolean isMove_right() {
        return move_right;
    }

    public void setMove_right(boolean move_right) {
        this.setup();
        this.move_right = move_right;
    }

    public boolean isMove_up() {
        return move_up;
    }

    public void setMove_up(boolean move_up) {
        this.setup();
        this.move_up = move_up;
    }

    public boolean isMove_down() {
        return move_down;
    }

    public void setMove_down(boolean move_down) {
        this.setup();
        this.move_down = move_down;
    }

    public void setup(){
        this.move_right = false;
        this.move_down = false;
        this.move_left = false;
        this.move_up = false;
    }
}
