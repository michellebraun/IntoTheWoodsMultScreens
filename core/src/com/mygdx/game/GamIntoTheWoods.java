package com.mygdx.game;

import com.badlogic.gdx.Game;

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
		if(currentState==GameState.GAME){
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
