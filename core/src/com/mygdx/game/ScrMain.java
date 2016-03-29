package com.mygdx.game;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;


import sun.java2d.ScreenUpdateManager;

/**
 * Created by michelle on 3/22/2016.
 */
 public class ScrMain implements Screen, InputProcessor {
    GamIntoTheWoods gamIntoTheWoods;
    TextButton tbGame;
    Stage stage;
    Skin skin = new Skin();
    TbsMenu tbsMenu;

    public ScrMain(GamIntoTheWoods gamIntoTheWoods) {
    }
    public void create() {
        stage = new Stage();
        //tbsMenu = new TbsMenu();
        //tbGame = new TbMenu("Game", tbsMenu);
        //tbGame.setPosition(Gdx.graphics.getWidth() / 2 - Gdx.graphics.getWidth() / 8, Gdx.graphics.getHeight() / 3 * 2);

        TextButton.TextButtonStyle buttonStyle = new TextButton.TextButtonStyle();
        TextureAtlas taNewGame;
        BitmapFont font = new BitmapFont();
        skin.add("default", font);
        taNewGame = new TextureAtlas(Gdx.files.internal("buttonpressed.txt"));
        skin.addRegions(taNewGame);
        buttonStyle.up = skin.getDrawable("buttonpressed01");
        buttonStyle.over = skin.getDrawable("buttonpressed02");
        buttonStyle.font = skin.getFont("default");
        TextButton button = new TextButton("", buttonStyle);
        stage.addActor(button);
    }
    @Override
    public void show() {
        create();
    }

    @Override
    public void render(float delta) {
        if (tbGame.isPressed()) { //When you click the Play Button, it sets the screen to the Play Screen, and updates.
            gamIntoTheWoods.currentState = GamIntoTheWoods.GameState.GAME;
            gamIntoTheWoods.updateState();
        }
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

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}