package Business;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silini: "+game.getGameName());
		
	}

	@Override
	public void getAll(Game[] games) {
		for (Game game : games) {
			System.out.println(game.getGameName());
		}
		
	}

}
