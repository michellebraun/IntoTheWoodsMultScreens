package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

/**
 * Created by michelle on 3/27/2016.
 */
public class TbsMenu extends TextButton.TextButtonStyle {
    Skin skin = new Skin(); // a generic skin for the tbs.
    public TbsMenu(){
        TextureAtlas taNewGame;
        BitmapFont font = new BitmapFont();
        skin.add("default", font);
        taNewGame = new TextureAtlas(Gdx.files.internal("Heroinepacked.pack"));
        skin.addRegions(taNewGame);


    }

    public Skin getTbs() {
        return skin;
    }
}
