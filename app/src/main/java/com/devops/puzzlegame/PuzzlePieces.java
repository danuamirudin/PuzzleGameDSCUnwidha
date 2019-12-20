package com.devops.puzzlegame;

import android.content.Context;

public class PuzzlePieces extends android.support.v7.widget.AppCompatImageView{
    public int xCoord;
    public int yCoord;
    public  int pieceWidth;
    public int pieceHeight;
    public  boolean canMove = true;

    public PuzzlePieces(Context context) {
        super(context);
    }
}
