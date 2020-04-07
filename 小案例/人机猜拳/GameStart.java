package 人机猜拳;


public class GameStart {
	public static void main(String[] args) {
		
		Game game = new Game();
		game.initial();//初始化后才可以开始游戏
		game.chooseCharacter();//选择角色
		game.game();//开始游戏
	}
}

