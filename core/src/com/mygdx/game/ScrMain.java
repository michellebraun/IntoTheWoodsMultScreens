package com.mygdx.game;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.Screen;


import sun.java2d.ScreenUpdateManager;

/**
 * Created by michelle on 3/22/2016.
 */
 public class ScrMain implements Screen {
    //GamIntoTheWoods gamIntoTheWoods;
    //TextButton tbGame;
    Stage stage;
    SpriteBatch batch;
    Skin skin = new Skin();
    //TbsMenu tbsMenu;

    public ScrMain(GamIntoTheWoods gamIntoTheWoods) {
    }
    public void create() {
        batch = new SpriteBatch();
        stage = new Stage();
        //tbsMenu = new TbsMenu();
        //tbGame = new TbMenu("Game", tbsMenu);
        //tbGame.setPosition(Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 8, Gdx.graphics.getHeight() / 3 * 2);

        TextButton.TextButtonStyle btnsbuttonStyle = new TextButton.TextButtonStyle();
        TextureAtlas taNewGame;
        BitmapFont font = new BitmapFont();
        skin.add("default", font);
        taNewGame = new TextureAtlas(Gdx.files.internal("buttonpressed.txt"));
        skin.addRegions(taNewGame);
        btnsbuttonStyle.up = skin.getDrawable("buttonpressed01");
        btnsbuttonStyle.over = skin.getDrawable("buttonpressed02");
        btnsbuttonStyle.font = skin.getFont("default");
        TextButton button = new TextButton("", btnsbuttonStyle);
        stage.addActor(button);
    }
    @Override
    public void show() {
        create();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        Gdx.gl.glClearColor(1,1,1,1);
        batch.begin();

        batch.end();
        stage.draw();
       /*if (button.isPressed()) { //When you click the Play Button, it sets the screen to the Play Screen, and updates.
           gamIntoTheWoods.currentState = GamIntoTheWoods.GameState.GAME;
           gamIntoTheWoods.updateState();
        }*/
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

}