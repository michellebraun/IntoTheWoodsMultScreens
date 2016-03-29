package com.mygdx.game;

import com.badlogic.gdx.Game;

//https://github.com/Mrgfhci/LibGDX1/tree/master/MultiScreens
//Referenced ^ For all of the multi screen switching

public class GamIntoTheWoods extends Game {

	ScrMain scrMain;
	ScrGame scrGame;


	public enum GameState {
		MENU, GAME
	}

	public GameState currentState;

	public void updateState(){
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
		super.render();
	}
}
