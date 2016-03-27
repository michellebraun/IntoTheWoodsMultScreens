package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GamIntoTheWoods extends Game {

	ScrMain scrMain;
	ScrGame scrGame;


	public enum GameState {
		MENU, GAME
		          //http://ics3ui.sgrondin.ca/ss23/LibGDX.html
		                //Different states.
	}

	public GameState currentState; //Current state.

	public void updateState(){ //Updates to different states based on what the current one is.
		if(currentState==GameState.MENU){
			setScreen(scrMain);
		}else if(currentState==GameState.GAME) {
			setScreen(scrGame);
		}
	}

	
	@Override
	public void create () {


		scrMain = new ScrMain(this);
		scrGame = new ScrGame(this);

		currentState = GameState.MENU; //Set the current state to the main menu, and update it.
		updateState();
	}

	@Override
	public void render () {

	}
}
